package turtle;

/**
 * Moves the turtle *number of moves* to the right. 
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

public class Right extends Command {
	 
	 public Right(int move) {
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
			 row = row + 1;
			 if (row >= board.length) {
				 row = board.length-1;
			 }
		     board[row][column] = true; 
		     l = l + 1;
		 }
		 turtle.setRow(row);
	 }
	 
}
