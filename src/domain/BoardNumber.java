package domain;

public class BoardNumber {

    private Integer number;
    private boolean marked;

    private Row row;


    public BoardNumber(int number, boolean marked){
        this.number = number;
        this.marked = marked;
    }

    public void setNumber(Integer number){
        this.number = number;
    }

    public Integer getNumber(){
        return this.number;
    }

    public void setMarked(boolean marked){
        this.marked = marked;
    }

    public boolean isMarked(){
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

    public boolean equals(Object obj){

        if(obj instanceof BoardNumber){

            BoardNumber boardNumber = (BoardNumber) obj;
            if(boardNumber.getNumber().equals(this.getNumber()) && boardNumber.getRow().equals(this.getRow())){
                return true;
            }
        }
        return false;
    }

    public int hasCode(){
       return 0;
    }
}
