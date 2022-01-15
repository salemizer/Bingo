import java.util.ArrayList;
import java.util.List;



public class Board {

    private String boardId = "";
    private List<Row> rowList = new ArrayList<Row>();

    public Board(){
    }

    public Board(String boardId){
        this.boardId = boardId;
    }


    public Board(List<Row> rowList){
        this.rowList = rowList;
    }

    public void setBoardId(String boardId){
        this.boardId = boardId;
    }

    public String getBoardId(){
        return this.boardId;
    }

    public void setRowList(List<Row> rowList){
        this.rowList = rowList;
    }

    public List<Row> getRowList(){
        return this.rowList;
    }


}
