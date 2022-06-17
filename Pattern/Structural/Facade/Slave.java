package Pattern.Structural.Facade;

/**
 * This is a basic example class that shows the use of the Facade pattern.
 * The client is unaware of how the master and slave classes are implemented.
 */
public class Slave {
    /**
     * NoArgs constructor for the slave class.
     */
    public Slave(){};
    /**
     * This method is a simple example method.
     */
    public void execute()
    {
        System.out.println("Slave has been executed");
    }
    /**
     * Another simple example method.
     */
    public void getWhipped()
    {
        System.out.println("Slave has been whipped");
    }
}
