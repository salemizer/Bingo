import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JTextPane;


public class Bingo {



    static List<Integer> draw_numbers = null;
    static List<Board> board_list = null;


    // construct bingo board
    public Bingo(){

        Board board1 = new Board();
        Board board2 = new Board();
        Board board3 = new Board();

        initBoardOne(board1);
         initBoardTwo(board2);
        initBoardThree(board3);

        board_list = new ArrayList<Board>();

        board_list.add(board1);
        board_list.add(board2);
        board_list.add(board3);

        initDrawNumbers();

    }



    static Board initBoardOne(Board board){

        board.setBoardId("One");

        List<BoardNumber> list  = new ArrayList<BoardNumber>();
        list.add(new BoardNumber(22, false));
        list.add(new BoardNumber(13, false));
        list.add(new BoardNumber(17, false));
        list.add(new BoardNumber(11, false));
        list.add(new BoardNumber(0, false));

        Row row1 = new Row(list);
        row1.setBoard(board);


        list = new ArrayList<BoardNumber>();
        list.add(new BoardNumber(8, false));
        list.add(new BoardNumber(2, false));
        list.add(new BoardNumber(23, false));
        list.add(new BoardNumber(4, false));
        list.add(new BoardNumber(24, false));

        Row row2 = new Row(list);
        row2.setBoard(board);


        list = new ArrayList<BoardNumber>();
        list.add(new BoardNumber(21, false));
        list.add(new BoardNumber(9, false));
        list.add(new BoardNumber(14, false));
        list.add(new BoardNumber(16, false));
        list.add(new BoardNumber(7, false));

        Row row3 = new Row(list);
        row3.setBoard(board);

        list = new ArrayList<BoardNumber>();
        list.add(new BoardNumber(6, false));
        list.add(new BoardNumber(10, false));
        list.add(new BoardNumber(3, false));
        list.add(new BoardNumber(18, false));
        list.add(new BoardNumber(5, false));

        Row row4 = new Row(list);
        row4.setBoard(board);

        list = new ArrayList<BoardNumber>();
        list.add(new BoardNumber(1, false));
        list.add(new BoardNumber(12, false));
        list.add(new BoardNumber(20, false));
        list.add(new BoardNumber(15, false));
        list.add(new BoardNumber(19, false));

        Row row5 = new Row(list);
        row5.setBoard(board);


        // add rows to the board
        List<Row> rowList = new ArrayList<Row>();
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4);
        rowList.add(row5);

        board.setRowList(rowList);

        return board;
    }



    static Board initBoardTwo(Board board){

        board.setBoardId("Two");

        List<BoardNumber> list  = new ArrayList<BoardNumber>();
        list.add(new BoardNumber(3, false));
        list.add(new BoardNumber(15, false));
        list.add(new BoardNumber(0, false));
        list.add(new BoardNumber(2, false));
        list.add(new BoardNumber(22, false));

        Row row1 = new Row(list);
        row1.setBoard(board);


        list = new ArrayList<BoardNumber>();
        list.add(new BoardNumber(9, false));
        list.add(new BoardNumber(18, false));
        list.add(new BoardNumber(13, false));
        list.add(new BoardNumber(17, false));
        list.add(new BoardNumber(5, false));

        Row row2 = new Row(list);
        row2.setBoard(board);


        list = new ArrayList<BoardNumber>();
        list.add(new BoardNumber(19, false));
        list.add(new BoardNumber(8, false));
        list.add(new BoardNumber(7, false));
        list.add(new BoardNumber(25, false));
        list.add(new BoardNumber(23, false));

        Row row3 = new Row(list);
        row3.setBoard(board);

        list = new ArrayList<BoardNumber>();
        list.add(new BoardNumber(20, false));
        list.add(new BoardNumber(11, false));
        list.add(new BoardNumber(10, false));
        list.add(new BoardNumber(24, false));
        list.add(new BoardNumber(4, false));

        Row row4 = new Row(list);
        row4.setBoard(board);

        list = new ArrayList<BoardNumber>();
        list.add(new BoardNumber(14, false));
        list.add(new BoardNumber(21, false));
        list.add(new BoardNumber(16, false));
        list.add(new BoardNumber(12, false));
        list.add(new BoardNumber(6, false));

        Row row5 = new Row(list);
        row5.setBoard(board);


        // add rows to the board
        List<Row> rowList = new ArrayList<Row>();
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4);
        rowList.add(row5);

        board.setRowList(rowList);

        return board;
    }



    static Board initBoardThree(Board board){

        board.setBoardId("Three");

        List<BoardNumber> list  = new ArrayList<BoardNumber>();
        list.add(new BoardNumber(14, false));
        list.add(new BoardNumber(21, false));
        list.add(new BoardNumber(17, false));
        list.add(new BoardNumber(24, false));
        list.add(new BoardNumber(4, false));

        Row row1 = new Row(list);
        row1.setBoard(board);


        list = new ArrayList<BoardNumber>();
        list.add(new BoardNumber(10, false));
        list.add(new BoardNumber(16, false));
        list.add(new BoardNumber(15, false));
        list.add(new BoardNumber(9, false));
        list.add(new BoardNumber(19, false));

        Row row2 = new Row(list);
        row2.setBoard(board);


        list = new ArrayList<BoardNumber>();
        list.add(new BoardNumber(18, false));
        list.add(new BoardNumber(8, false));
        list.add(new BoardNumber(23, false));
        list.add(new BoardNumber(26, false));
        list.add(new BoardNumber(20, false));

        Row row3 = new Row(list);
        row3.setBoard(board);

        list = new ArrayList<BoardNumber>();
        list.add(new BoardNumber(22, false));
        list.add(new BoardNumber(11, false));
        list.add(new BoardNumber(13, false));
        list.add(new BoardNumber(6, false));
        list.add(new BoardNumber(5, false));

        Row row4 = new Row(list);
        row4.setBoard(board);

        list = new ArrayList<BoardNumber>();
        list.add(new BoardNumber(2, false));
        list.add(new BoardNumber(0, false));
        list.add(new BoardNumber(12, false));
        list.add(new BoardNumber(3, false));
        list.add(new BoardNumber(7, false));

        Row row5 = new Row(list);
        row5.setBoard(board);


        // add rows to the board
        List<Row> rowList = new ArrayList<Row>();
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4);
        rowList.add(row5);

        board.setRowList(rowList);

        return board;
    }


    static void initDrawNumbers(){

        draw_numbers = new ArrayList<Integer>();
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


    static void initBoard(List<Board>board_list){

        if(board_list.size() > 0){

            for(int i = 0; i < board_list.size() ; i++){

//				Board newBoard = new Board();

                Board board = board_list.get(i);

                List<BoardNumber> list  = new ArrayList<BoardNumber>();
                list.add(new BoardNumber(14, false));
                list.add(new BoardNumber(21, false));
                list.add(new BoardNumber(17, false));
                list.add(new BoardNumber(24, false));
                list.add(new BoardNumber(4, false));

                Row row1 = new Row(list);
                row1.setBoard(board);


                list = new ArrayList<BoardNumber>();
                list.add(new BoardNumber(10, false));
                list.add(new BoardNumber(16, false));
                list.add(new BoardNumber(15, false));
                list.add(new BoardNumber(9, false));
                list.add(new BoardNumber(19, false));

                Row row2 = new Row(list);
                row2.setBoard(board);


                list = new ArrayList<BoardNumber>();
                list.add(new BoardNumber(18, false));
                list.add(new BoardNumber(8, false));
                list.add(new BoardNumber(23, false));
                list.add(new BoardNumber(26, false));
                list.add(new BoardNumber(20, false));

                Row row3 = new Row(list);
                row3.setBoard(board);

                list = new ArrayList<BoardNumber>();
                list.add(new BoardNumber(22, false));
                list.add(new BoardNumber(11, false));
                list.add(new BoardNumber(13, false));
                list.add(new BoardNumber(6, false));
                list.add(new BoardNumber(5, false));

                Row row4 = new Row(list);
                row4.setBoard(board);

                list = new ArrayList<BoardNumber>();
                list.add(new BoardNumber(2, false));
                list.add(new BoardNumber(0, false));
                list.add(new BoardNumber(12, false));
                list.add(new BoardNumber(3, false));
                list.add(new BoardNumber(7, false));

                Row row5 = new Row(list);
                row5.setBoard(board);


                // add rows to the board
                List<Row> rowList = new ArrayList<Row>();
                rowList.add(row1);
                rowList.add(row2);
                rowList.add(row3);
                rowList.add(row4);
                rowList.add(row5);

//				newBoard.setRowList(rowList);

                board.setRowList(rowList);

            }

        }
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

//				System.out.println("entry= " + entry.getNumber() + ", marked= " + entry.getMarked());

                if(!entry.getMarked()){
                    continue rowLoop;
                }
            }

            bingo = true;

        }

        return bingo;
    }



    static void printBoard(Board board){

//		for(Board board:board_list){

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

                if(draw_numbers.size() > 0){

                    System.out.println("Pick one number: " + draw_numbers);

                    String s = scanner.nextLine();

                    Integer chosenNumber = null;

                    if(s.length() > 0 && Character.isDigit(s.charAt(0))){
                        chosenNumber =  Integer.valueOf(s);
                    }else{
                        continue;
                    }

                    if(draw_numbers.contains(chosenNumber)){

                        if(markBoardNumber(chosenNumber, board_list)){

                            draw_numbers.remove(chosenNumber);

                            boolean isBingo = false;

                            for(Board board:board_list){

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

