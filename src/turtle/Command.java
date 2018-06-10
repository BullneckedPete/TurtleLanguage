package turtle;

/**
 * The commandClass and it's subclasses handles the commands and updates
 * the Turtles Position.
 *
 * Since the Commands are programs they handle the program by performing.
 * The Command only knows where it has to go, the Turtle is responsible for
 * knowing where it is. The Command Class handles false Input by checking
 * the Invariant that the Command is not allowed to be negative integer.
 */

public abstract class Command implements ICommand {
	
	 protected int move;

	 public Command(int move) {
		 this.move = move;
		 assert invariant();
	 }
	 
	 public boolean invariant(){
		 return move >= 0;
	 }
	 
	 public abstract void perform(boolean[][] board, Turtle turtle);

}
