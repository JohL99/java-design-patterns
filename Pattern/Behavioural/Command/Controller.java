

package Pattern.Behavioural.Command;

/**
 * This is the concrete controller, it is responsible for executing the command(s) provided to it.
 */
public class Controller {
    /**
     * Local {@code Command} object that will be executed.
     */
    private Command someCommand;

    /**
     * This method is a simple constructor that takes a {@code Command} as a parameter. 
     * @param someCommand {@code Command} object to be executed.
     */
    public Controller(Command someCommand) {
        this.someCommand = someCommand;
    }

    /**
     * NoArgs constructor for the Controller.
     */
    public Controller(){}

    /**
     * This method is responsible for setting the local {@code Command} for the Controller.
     * @param someCommand {@code Command} to be executed.
     */
    public void setCommand(Command someCommand) {
        this.someCommand = someCommand;
    }
    /**
     * This method is responsible for executing the local {@code Command}.
     */
    public void executeCommand()
    {
        someCommand.execute();
    }
}
