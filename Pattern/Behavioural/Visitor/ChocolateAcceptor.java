package Pattern.Behavioural.Visitor;

/**
 * This is an example class that implements the  {@link Acceptor} interface.
 */
public class ChocolateAcceptor implements Acceptor {

    // Private member
    public int cocoa_count = 0;

    /**
     * Constructor for the ChocolateAcceptor class
     * @param cocoa The amount of cocoa in the chocolate
     */
    public ChocolateAcceptor(int cocoa)
    {
        this.cocoa_count = cocoa;
    }

    // Override the accept() method.
    @Override
    public int accept(Visitor v) {
        return v.visit(this);
    }

    
}
