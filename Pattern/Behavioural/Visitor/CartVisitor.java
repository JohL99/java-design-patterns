package Pattern.Behavioural.Visitor;

/**
 * This class implements the {@link Visitor} interface which allows it to visit any {@link Acceptor}.
 */
public class CartVisitor implements Visitor
{

    @Override
    public int visit(ChocolateAcceptor c) {
        // Returns the amount of cocoa in the chocolate in the cart
        return c.cocoa_count;
    }

    @Override
    public int visit(CoffeeAcceptor c) {
        // Returns the amount of beans in the coffee in the cart
        return c.bean_count;
    }
    
}