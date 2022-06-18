package Pattern.Behavioural.Command;

/**
 * This class is a an example {@link Command} that turns off the {@link Receiver}
 */
public class OffCommand implements Command {
    /**
     * The {@code Reciever} to be affected by the command.
     */
    private Receiver receiver;

    /**
     * Constructor for the {@code OffCommand}
     * @param reciever {@code Reciever} to be affected by the command.
     */
    public OffCommand(Receiver reciever) {
        this.receiver = reciever;
    }

    /**
     * Override of the {@code execute} method from the {@link Command} interface.
     */
    @Override
    public void execute() {
        receiver.turnOff();
    }
}
