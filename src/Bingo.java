import domain.Board;
import domain.BoardNumber;
import domain.Row;
import java.util.List;
import java.util.Scanner;


public class Bingo {

     List<Integer> draw_numbers = null;
     List<Board> board_list = null;


    public Bingo(){
        // returns list of Board
        board_list = BoardGenerator.generate();

        // returns list of Integer (Draw numbers)
        draw_numbers = DrawNumberGenerator.generate();
    }


    private boolean markBoardNumber(int number, List<Board> board_list){

        boolean done = false;

        for(Board board : board_list){

            List<Row> rowList = board.getRowList();

            outer: for(Row row : rowList){

                List<BoardNumber> BoardNumberList = row.getBoardNumberList();

                for(BoardNumber entry : BoardNumberList){

                    if(entry.getNumber() == number){
                        entry.setMarked(true);

                        System.out.println("Board " + row.getBoard().getBoardId() + ", Number " + entry.getNumber() + " is now marked!");
                        Util.printBoard(board);

                        done = true;
                        break outer;
                    }
                }
            }
        }

        return done;
    }



    // check Bingo horizontally

    private boolean checkHorizontal(Board board){

        boolean bingo = false;

        List<Row> rowList = board.getRowList();


        rowLoop: for(Row row : rowList){

            List<BoardNumber> BoardNumberList = row.getBoardNumberList();

            for(BoardNumber entry : BoardNumberList){

                if(!entry.getMarked()){
                    continue rowLoop;
                }
            }

            bingo = true;

        }

        return bingo;
    }


    // check bingo vertically

    private boolean checkVertical(Board board){

        boolean bingo = false;


        List<Row> rowList = board.getRowList();

        columnLoop: for(int c = 0; c < 5 ; c ++){

            for(int r = 0; r < 5 ; r ++){

                Row row = rowList.get(r);
                List <BoardNumber> entries =  row.getBoardNumberList();
                BoardNumber entry = entries.get(c);

                if(!entry.getMarked()){
                    continue columnLoop;
                }
            }

            bingo = true;
        }

        return bingo;
    }



    public static void main(String [] args){

        Bingo bingo = new Bingo();

        Scanner scanner = new Scanner(System.in);

        try{

            while(true){

                if(bingo.draw_numbers.size() > 0){

                    System.out.println("Pick one number: " + bingo.draw_numbers);

                    String s = scanner.nextLine();

                    Integer chosenNumber = null;

                    if(s.length() > 0 && Character.isDigit(s.charAt(0))){
                        chosenNumber =  Integer.valueOf(s);
                    }else{
                        continue;
                    }

                    if(bingo.draw_numbers.contains(chosenNumber)){

                        if(bingo.markBoardNumber(chosenNumber, bingo.board_list)){

                            bingo.draw_numbers.remove(chosenNumber);

                            boolean isBingo = false;

                            for(Board board:bingo.board_list){

                                if(bingo.checkHorizontal(board) || bingo.checkVertical(board) ){
                                    isBingo = true;
                                    System.out.println("Board " + board.getBoardId() +  " BINGOOOOOOOO !!");

                                }
                            }

                            if(isBingo)
                                break;
                        }
                    }

                }else{
                    System.err.println("No more numbers avail to draw !!");
                    break;
                }
            }

        }catch(Throwable throwable){

            throwable.printStackTrace();

        }finally{
            scanner.close();
        }
    }

}