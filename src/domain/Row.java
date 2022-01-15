package domain;

import java.util.ArrayList;
import java.util.List;


public class Row {

    private List<BoardNumber> boardNumberList;

    private Board board;


    public Row(){
    }

    public Row(List<BoardNumber> boardNumberList){
        this.boardNumberList = boardNumberList;
    }

    public void setBoardNumberList(List<BoardNumber>boardNumberList){
        this.boardNumberList = boardNumberList;
    }

    public List<BoardNumber> getBoardNumberList(){

        if(boardNumberList == null)
            boardNumberList = new ArrayList<BoardNumber>();

        return this.boardNumberList;
    }

    public void setBoard(Board board){
        this.board = board;
    }

    public Board getBoard(){
        return this.board;
    }

    public String toString(){

        return this.boardNumberList.toString();
    }
}
