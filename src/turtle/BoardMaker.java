package turtle;
import java.util.*;

/**
 * BoardMaker creates and returns the updated Board after every new Input.
 *
 * BoardMaker uses the CommandParser.java Class to parse the input. By 
 * iterating through the commandListthat the Parser Class created it passes
 * the Commands to the method perform, without knowing kind of Command it is.
 */


public class BoardMaker {

	private final static int SIZE = 100;
	private Turtle turtle;
	boolean[][] board;
	/**
	 * Parse the given turtle program and evaluate it. Render the trail as
	 * described in the problem description and return a SIZExSIZE board
	 * corresponding to the evaluated path.
	 *
	 * @param turtleProgram input program according to specification. may also contain invalid text!
	 * @return SIZExSIZE boolean board, where true values denote "red trail".
	 */

	public boolean[][] makeBoardFrom(String turtleProgram) throws ParserException {

		//this.board = new boolean[SIZE][SIZE];
		this.board = initialBoard();
		this.turtle = new Turtle(0,0, this.board);

		CommandParser parser = new CommandParser();
		parser.parse(turtleProgram);

		if (parser.commandState) {
			ArrayList<Command> commands = parser.getList();
			for (Command c : commands) {
				c.perform(this.board, this.turtle);
			}
		}

		return board;

	}

	public boolean[][] initialBoard() {




		// TODO: remove this and return a board instead

		boolean[][] board = new boolean[SIZE][SIZE];
		assert board.length != 0;
		return board;
		


	}




}