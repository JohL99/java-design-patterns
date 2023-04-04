package Pattern.Behavioural.Command;

/**
 * This class is the receiver class, it is acted upon by {@link Command} types.
 */
public class Receiver {

    /**
     * NoArgs constructor for the receiver.
     */
    public Receiver(){}

    /**
     * This method is responsible for turning the receiver on.
     */
    public void turnOn(){
        System.out.println("Receiver is on");
    };

    /**
     * This method is responsible for turning the receiver off.
     */
    public void turnOff(){
        System.out.println("Receiver is off");
    };
}
    

