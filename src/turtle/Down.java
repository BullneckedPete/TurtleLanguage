package turtle;

/**
 * Moves the turtle *number of moves* down. 
 * 
 * If the input typed in by the user is equal
 * or greater than the length of the board, the 
 * turtle will stop at the position of the length
 * of the board minus one.
 * 
 * Note that in order to perform correctly, the two
 * assertions, that board.length is not equals to zero
 * and that turtle is not null must hold.
 */

public class Down extends Command {
	 
	 public Down(int move) {
		 super(move);
	 }
	 
	 @Override
	 public void perform(boolean[][] board, Turtle turtle) {
		 
		 assert board.length != 0; 
		 assert turtle.equals(turtle); 
		 
		 int row = turtle.getRow();
		 int column = turtle.getColumn();
		 
		 int l = 1; 
		 
		 while(l <= move) {
			 column = column + 1;
			 if (column >= board.length) {
				 column = board.length-1;
			 }
		     board[row][column] = true; 
			 l = l + 1;
		 }
		 turtle.setColumn(column);
	 }	 
}
