import domain.Board;
import domain.Row;
import java.util.List;

public class Util {

    public static void printBoard(Board board){

        List<Row> rowList = board.getRowList();
        for(Row row:rowList){
            System.out.println(row);
        }
        System.out.println("\n-------------------- \n");
    }
}
