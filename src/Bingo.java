import domain.Board;
import domain.BoardNumber;
import domain.Row;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Bingo {

     List<Integer> draw_numbers = null;
     List<Board> board_list = null;
    // construct bingo board
    public Bingo(){

        // returns list of Board
        board_list = BoardGenerator.generate();
        initDrawNumbers();

    }


     void initDrawNumbers(){

        this.draw_numbers = new ArrayList<Integer>();
        // draw numbers
        draw_numbers.add(7);
        draw_numbers.add(4);
        draw_numbers.add(9);
        draw_numbers.add(5);
        draw_numbers.add(11);
        draw_numbers.add(17);
        draw_numbers.add(23);
        draw_numbers.add(2);
        draw_numbers.add(0);
        draw_numbers.add(14);
        draw_numbers.add(21);
        draw_numbers.add(24);
        draw_numbers.add(10);
        draw_numbers.add(16);
        draw_numbers.add(13);
        draw_numbers.add(6);
        draw_numbers.add(15);
        draw_numbers.add(25);
        draw_numbers.add(12);
        draw_numbers.add(22);
        draw_numbers.add(18);
        draw_numbers.add(20);
        draw_numbers.add(8);
        draw_numbers.add(19);
        draw_numbers.add(3);
        draw_numbers.add(26);
        draw_numbers.add(1);
    }


    static boolean markBoardNumber(int number, List<Board> board_list){

        boolean done = false;

        for(Board board : board_list){

            List<Row> rowList = board.getRowList();

            outer: for(Row row : rowList){

                List<BoardNumber> BoardNumberList = row.getBoardNumberList();

                for(BoardNumber entry : BoardNumberList){

                    if(entry.getNumber() == number){
                        entry.setMarked(true);

                        System.out.println("Board " + row.getBoard().getBoardId() + ", Number " + entry.getNumber() + " is now marked!");
                        printBoard(board);

                        done = true;
                        break outer;
                    }
                }
            }
        }

        return done;
    }



    // check Bingo horizontally

    static boolean checkHorizontal(Board board){

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



    static void printBoard(Board board){

//		for(domain.Board board:board_list){

        List<Row> rowList = board.getRowList();
        for(Row row:rowList){
            System.out.println(row);
        }
        System.out.println("\n-------------------- \n");
//		}
    }


    // check bingo vertically

    static boolean checkVertical(Board board){

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

                        if(markBoardNumber(chosenNumber, bingo.board_list)){

                            bingo.draw_numbers.remove(chosenNumber);

                            boolean isBingo = false;

                            for(Board board:bingo.board_list){

                                if(checkHorizontal(board) || checkVertical(board) ){
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

