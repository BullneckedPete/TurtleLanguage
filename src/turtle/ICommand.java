package turtle;

public interface ICommand {
    /**
     * Moves the turtle on the board. There are five possible moves:
     * Up, Down, Right, Left and Diagonal. 
     * 
     * @param board   the actual state of the board
     * @param turtle  information about the turtle, especially the position
     */
	public void perform(boolean[][] board, Turtle turtle);
	
	/**
	 * Ensures that the move is a positive integer >= 0.
	 * 
	 * @return true, if move >= 0, otherwise false
	 */
	public boolean invariant();

}
