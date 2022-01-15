package domain;

public class BoardNumber {

    private int number;
    private boolean marked;

    private Row row;


    public BoardNumber(int number, boolean marked){
        this.number = number;
        this.marked = marked;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public int getNumber(){
        return this.number;
    }

    public void setMarked(boolean marked){
        this.marked = marked;
    }

    public boolean getMarked(){
        return this.marked;
    }

    public void setRow(Row row){
        this.row = row;
    }

    public Row getRow(){
        return this.row;
    }

    public String toString(){
        return Integer.toString(this.getNumber());
    }
}
