package Pattern.Creational.AbstractFactory;

/**
 * Concrete factory for the ork army.
 * This implements the {@link OrkFactory} interface.
 */
public class WarFactory implements OrkFactory {

    // Create a new WarLord.
    @Override
    public Ork createWarlord(int victories) {
        return new Warlord(victories);
    }

    // Creates a new WarBoss.
    @Override
    public Ork createWarboss(int minions) {
        return new Warboss(minions);
    }
    
}
