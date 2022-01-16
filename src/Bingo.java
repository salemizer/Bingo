import domain.Board;
import domain.BoardNumber;
import domain.Row;
import generator.BoardGenerator;
import generator.DrawNumberGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Bingo {

    private List<Integer> draw_numbers = null;
    private List<Integer> marked_numbers = null;

    private List<Board> board_list = null;


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

                if(!entry.isMarked()){
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

                if(!entry.isMarked()){
                    continue columnLoop;
                }
            }

            bingo = true;
        }

        return bingo;
    }



    private int calculateScore(Board board, int lastDrawnNumber){

        int sum = 0;

         for(Row row : board.getRowList()){
             for(BoardNumber number : row.getBoardNumberList()){
                 if( ! number.isMarked()){
                      sum += number.getNumber();
                 }
             }
         }
         return sum * lastDrawnNumber;
    }


    public static void main(String [] args){

        Bingo bingo = new Bingo();

        bingo.marked_numbers = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);

        try{

            while(true){

                if(bingo.draw_numbers.size() > 0){

                    System.out.println("Pick one number: " + bingo.draw_numbers);

                    String s = scanner.nextLine();

                    Integer drawnNumber = null;

                    if(s.length() > 0 && Character.isDigit(s.charAt(0))){
                        drawnNumber =  Integer.valueOf(s);
                    }else{
                        continue;
                    }

                    if(bingo.draw_numbers.contains(drawnNumber)){

                        if(bingo.markBoardNumber(drawnNumber, bingo.board_list)){

                            bingo.draw_numbers.remove(drawnNumber);

                         //   bingo.marked_numbers.add(chosenNumber);

                            boolean isBingo = false;

                            for(Board board:bingo.board_list){

                                if(bingo.checkHorizontal(board) || bingo.checkVertical(board) ){
                                    isBingo = true;
                                    System.err.println(" BINGOOOOOOOOOOOOOOOOOOOO !! \n");
//                                    System.out.println("Numbers= " + bingo.marked_numbers + "\n");
                                    System.err.println("Board " + board.getBoardId() + " Score= " + bingo.calculateScore(board, drawnNumber) + "\n");
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