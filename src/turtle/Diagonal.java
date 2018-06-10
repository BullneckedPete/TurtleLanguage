package turtle;

/**
 * Moves the turtle *number of moves* in a diagonal way,
 * without leaving a trail. In contrast to the other Command
 * classes, the DiagonalClass needs 2 moves: One to move along 
 * number of rows, and one to move along the number of columns.
 * 
 * If the input typed in by the user is equal or greater than the
 * length of the board, for both rows columns, the turtle will 
 * stop at the position of the length of the board minus one.
 * 
 * Note that in order to perform correctly, the two
 * assertions, that board.length is not equals to zero
 * and that turtle is not null must hold.
 */

public class Diagonal extends Command {

	private int move2;

	public Diagonal(int move, int move2) {
		super(move);
		this.move2 = move2;
	 }
	
	public void perform (boolean[][] board, Turtle turtle) {
		 
		assert board.length != 0;
		assert turtle.equals(turtle);

		int row = turtle.getRow()+move;
		if (row >= board.length) {
			row = board.length-1;
		}
		int column = turtle.getColumn()+move2;
		if (column >= board.length) {
			column = board.length-1;
		}

		board[row][column] = true;
		
		turtle.setRow(row);
		turtle.setColumn(column);
		
	 }	 
}

