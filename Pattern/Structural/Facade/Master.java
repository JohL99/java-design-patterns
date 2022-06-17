package Pattern.Structural.Facade;

/**
 * This is a basic example class that shows the use of the Facade pattern.
 * The client is unaware of how the master
 */
public class Master {
    
    // Private Member
    private Slave slave = null;

    /**
     * Constructor for the master class
     * @param s The {@link Slave} class to be used by the master class.
     */
    public Master(Slave s) {
        this.slave = s;
    }

    /**
     * This is a simple example method that calls a method.
     */
    public void whip() {
        this.slave.getWhipped();
    }
}
