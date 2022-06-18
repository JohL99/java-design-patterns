package Pattern.Behavioural.Observer;

import java.util.ArrayList;

/**
 * This class implements the Subject and is the primary subject in this example.
 * It can notify all observers of a change, in this instance, inflation. It also registers and deregisters observers.
 */
public class MarketTrend implements Subject {
    // Private member for example purpose.
    int inflation;
    // Private member to store the list of observables.
    ArrayList<Observable> observables;

    /**
     * Constructor for the {@code MarketTrend}
     * @param inflation The initial inflation of the market
     */
    public MarketTrend(int inflation)
    {
        this.inflation = inflation;
        this.observables = new ArrayList<Observable>();
    }

    @Override
    public void registerObserver(Observable o) {
        this.observables.add(o);
    }
    @Override
    public void deregisterObserver(Observable o) {
        this.observables.remove(o);
    }

    // This method changes all observers using their update method.
    @Override
    public void notifyObservers() {
        for (Observable o : observables) {
            o.update(this.inflation);
        }
        
    }

}
