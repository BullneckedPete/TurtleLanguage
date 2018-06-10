package turtle;
import java.util.*;


/**
 * Handles the parsing of the command statement parsing every line and then 
 * checking if it's a valid command.
 *
 * paarseCommandLine stores every new line in an Array of Strings. Through 
 * iterating through this array the parseCommand checks every line if it is
 * a valid input and if so creates a Object of the Right command.
 * It ignores invalid commands.
 */

public class CommandParser {

    public ArrayList<Command> commands = new ArrayList<Command>();
    public boolean commandState = false;

    private String[] lines;

    protected void parse(String programmCommand) {
            lines = programmCommand.split("\\n");
            for (String line : lines) {
				parseCommand(line);
			}
    }

    protected void parseCommand(String line) {

        String regex1 = "[\\w]+\\s[\\d]+$";
        String regex2 = "[\\w]+\\s[\\d]+\\s[\\d]+$";

        String commandKeyWord;
        int coordinate1;
        int coordinate2;
        
        if (line.matches(regex1)) {

            String[] commandLine = line.split("\\s");
            commandKeyWord = commandLine[0].toLowerCase();
            coordinate1 = Integer.parseInt(commandLine[1]);

            if (commandLine.length == 2) {

                if (commandKeyWord.equals("right")) {
                    commands.add(new Right(coordinate1));
                    readyToPerform();
                }

                if (commandKeyWord.equals("left")) {
                    commands.add(new Left(coordinate1));
                    readyToPerform();

                }

                if (commandKeyWord.equals("up")) {
                    commands.add(new Up(coordinate1));
                    readyToPerform();
                }

                if (commandKeyWord.equals("down")) {
                    commands.add(new Down(coordinate1));
                    readyToPerform();
                }

            }

        }
        if (line.matches(regex2)) {

            String[] commandLine = line.split(" ");
            commandKeyWord = commandLine[0].toLowerCase();
            coordinate1 = Integer.parseInt(commandLine[1]);
            coordinate2 = Integer.parseInt(commandLine[2]);

            if (commandKeyWord.equals("diagonal")) {
                commands.add(new Diagonal(coordinate1, coordinate2));
                readyToPerform();
            }
        }
    }

    public ArrayList<Command> getList() {

        assert (!commands.isEmpty());
        return this.commands;
        
    }

    public void readyToPerform() {

        this.commandState = true;
        
    }

}