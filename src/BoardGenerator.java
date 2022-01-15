import domain.Board;
import domain.BoardNumber;
import domain.Row;
import java.util.ArrayList;
import java.util.List;

public class BoardGenerator {


    public static List<Board> generate(){

         Board board1 = new Board();
         Board board2 = new Board();
         Board board3 = new Board();

         initBoardOne(board1);
         initBoardTwo(board2);
         initBoardThree(board3);

         List<Board> board_list = new ArrayList<Board>();

         board_list.add(board1);
         board_list.add(board2);
         board_list.add(board3);

         return board_list;
     }



    private static void initBoardOne(Board board){

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
    }



   private static void initBoardTwo(Board board){

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

    }



    private static void initBoardThree(Board board){

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
    }
}


