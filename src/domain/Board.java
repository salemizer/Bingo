package domain;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private String boardId;
    private List<Row> rowList;


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
        if(boardId == null)
            boardId = "";

        return this.boardId;
    }

    public void setRowList(List<Row> rowList){
        this.rowList = rowList;
    }

    public List<Row> getRowList(){
        if(this.rowList == null)
            rowList = new ArrayList<Row>();

        return this.rowList;
    }


    public boolean equals(Object obj){

        if(obj instanceof Board){

            Board board = (Board) obj;
            if(board.getBoardId().equals(this.getBoardId()) && board.getRowList().equals(this.getRowList())){
                return true;
            }
        }
        return false;
    }

    public int hasCode(){
        return 0;
    }
}
