package Pattern.Creational.AbstractFactory;

/**
 * This is an example class for the abstract factory pattern.
 */
public class Warboss implements Ork {

    // Private Members.
    private int minions;

    /**
     * This is the constructor for the warboss class.
     * @param m The number of minions the warboss has.
     */
    public Warboss(int m)
    {
    this.minions = m;
    };
    // Implement the ork interface.
    @Override
    public void warcry() {
        System.out.println("WAAAAGH!\nI have " + minions + " minions!");
    }
    
}
