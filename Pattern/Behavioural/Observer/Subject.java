package Pattern.Behavioural.Observer;

/**
 * This is an interface for the observer pattern, it defines the registration, deregistration and notifcation method(s).
 * All classes that implement this interface will be able to observe any class that implements the {@link Observable} interface
 */
public interface Subject {
    /**
     * This method is called by the Subject class when it wants to register an observer with the subject.
     * @param o The observer to be registered.
     */
    void registerObserver(Observable o);
    /**
     * This method is called by the Subject class when it wants to deregister an observer with the subject.
     * @param o The observer to be deregistered.
     */
    void deregisterObserver(Observable o);

    /**
     * This method is called by the Subject class when it wants to notify all observers of a change in the state of the subject.
     */
    void notifyObservers();
}
