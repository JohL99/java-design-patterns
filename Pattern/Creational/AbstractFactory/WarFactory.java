package Pattern.Creational.AbstractFactory;

/**
 * Concrete factory for the ork army.
 * This implements the {@link OrkFactory} interface.
 */
public class WarFactory implements OrkFactory {

    // Create a new WarLord.
    @Override
    public Ork createWarlord(int v) {
        return new Warlord(v);
    }

    // Creates a new WarBoss.
    @Override
    public Ork createWarboss(int m) {
        return new Warboss(m);
    }
    
}
