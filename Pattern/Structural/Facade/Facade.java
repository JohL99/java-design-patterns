package Pattern.Structural.Facade;

/**
 * This class is the facade of the system. It is the only class that the client will use.
 */
public class Facade {

    // Private Members
    private Slave slave;
    private Master master;

    /**
     * This is the constructor for the facade class.
     */
    public Facade() {
        slave = new Slave();
        master = new Master(slave);
    };
    
    /**
     * This unified operation will call methods and procedures, the client will be unaware of the internal implementation but will witness results.
     */
    public void unifiedOperation()
    {
        master.whip();
        slave.execute();
    }
}
