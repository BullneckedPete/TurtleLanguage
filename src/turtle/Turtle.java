package turtle;

/**
 * The Turtle knows it's currentPosition in the Board and 
 * gets updated by the Commands.
 *
 * valid State: The turtle has to be in the Matrix
 * The turtle knows it's current position in the Matrix
 * 
 * Note that when we change the position of the turtle with
 * one of the two methods setRow() or setColumn() the para-
 * meters row respectively column need to be greater or
 * equal to zero.
 */


public class Turtle {

	private int row;
	private int column;
	private boolean[][] board;

	public Turtle(int row, int column, boolean[][] board){
	    this.row= row;
	    this.column=column;
	    this.board=board;
	    board[row][column]=true;
	    assert invariant();
	}
	
	private boolean invariant(){
	    return row>=0 && column>=0 && row<board.length && column<board.length;
    }

	public int getRow(){
	    return row;
	}

    public int getColumn() {
	    return column;
	}

    public void setRow(int row){
    	assert row >=0;
    	this.row = row;
	}

	public void setColumn(int column){
		assert column >= 0;
		this.column = column;
    }

}
