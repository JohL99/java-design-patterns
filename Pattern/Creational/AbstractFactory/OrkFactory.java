package Pattern.Creational.AbstractFactory;

/**
 * This is the abstract factory interface for the abstract factory pattern.
 * This interface defines the methods that the concrete factory must implement.
 */
public abstract interface OrkFactory {
    /**
     * This method returns a new WarLord.
     * @param v The victory count of the new WarLord.
     * @return The new WarLord.
     */
    public abstract Ork createWarlord(int v); // WarLord creation.

    /**
     * This method returns a new WarBoss.
     * @param m The minion count of the new WarBoss.
     * @return The new WarBoss.
     */
    public abstract Ork createWarboss(int m); // WarBoss creation.
}
