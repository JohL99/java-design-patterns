package Pattern.Behavioural.Observer;

/**
 * This is an example class that implements the {@link Observable} interface.
 * 
 */
public class GoogStock implements Observable {

    // This private member exists to store the state of the observable.
    private int price = 0;

       /**
     * Constructor for the {@code GoogStock}
     * @param price The initial price of the stock
     */
    public GoogStock(int price) {
        this.price = price;
    }

     /**
     * This method prints the price of the stock
     */
    public void printPrice()
    {
        System.out.println("Google stock price: " + this.price);
    }

    /**
     * This method is called by a {@link Subject} when it updating the state of this {@code Observable}
     */
    @Override
    public void update(int inflation) {
        this.price += inflation;
        this.printPrice();
        
    }
    
}
