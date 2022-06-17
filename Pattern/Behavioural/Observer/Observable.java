package Pattern.Behavioural.Observer;

/**
 * This is an interface for the observer pattern, it defines the update() method
 * All classes that implement this interface will be observable by any class that implements the {@link Subject} interface
 */
public interface Observable {
    /**
     * This method is called by a {@link Subject} when it wants to notify all observers of a change in the state of the subject
     * @param inflation The inflation set by a {@link Subject}
     */
    void update(int inflation);
}
