package turtle;

/**
 * Moves the turtle *number of moves* to the left. 
 * 
 * If the input typed in by the user is equal
 * or smaller than zero, the turtle will stop at
 * the position zero.
 * 
 * Note that in order to perform correctly, the two
 * assertions, that board.length is not equals to zero
 * and that turtle is not null must hold.
 */

public class Left extends Command{


	 public Left(int move) {
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
			 row = row - 1;
			 if (row <= 0) {
				 row = 0;
			 }
		     board[row][column] = true; 
			 l++;
		 }
		 turtle.setRow(row);
		 
	 }
	
}
