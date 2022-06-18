package Pattern.Creational.AbstractFactory;

/**
 * This is an example class for the abstract factory pattern.
 *
 */
public class Warlord implements Ork {
    // Private Members
    private int victories;
    
    /**
     * This is the constructor for the warlord class.
     * @param v The number of victories the warlord has.
     */
    public Warlord(int v)
    {
        this.victories = v;
    }

    // Implementation of the ork interface.
    @Override
    public void warcry() {
        System.out.println("WAAAGH!\nI have " + this.victories + " victories!");
        
    }
    
}
