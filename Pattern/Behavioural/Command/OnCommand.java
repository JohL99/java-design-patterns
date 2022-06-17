package Pattern.Behavioural.Command;

/**
 * This class is a an example {@link Command} that turns on the {@link Receiver}
 */
public class OnCommand implements Command {
    /**
     * The {@code Reciever} to be affected by the command.
     */
    private Receiver receiver;

    /**
     * Constructor for the {@code OffCommand}
     * 
     * @param reciever {@code Reciever} to be affected by the command.
     */
    public OnCommand(Receiver reciever) {
        this.receiver = reciever;
    }

    /**
     * Override of the {@code execute} method from the {@link Command} interface.
     */
    @Override
    public void execute() {
        receiver.turnOn();
    }
}
