package Pattern.Behavioural.Visitor;

/**
 * This is an example class that implements the  {@link Acceptor} interface.
 */
public class CoffeeAcceptor implements Acceptor {

    // Private member
    public int bean_count = 0;
    
    /**
     * Constructor for the CoffeeAcceptor class
     * @param bean The amount of beans in the coffee
     */
    public CoffeeAcceptor(int bean)
    {
        this.bean_count = bean;
    }
    // Override the accept() method.
    @Override
    public int accept(Visitor v) {
        return v.visit(this);
    }
    
}
