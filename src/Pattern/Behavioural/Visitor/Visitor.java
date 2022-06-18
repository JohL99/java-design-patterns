package Pattern.Behavioural.Visitor;

/**
 * This is the interface for the visitor pattern, it defines multiple visit methods, allowing for different behaviour for different types of acceptors
 */
public interface Visitor {
    int visit(ChocolateAcceptor c);
    int visit(CoffeeAcceptor c);
}
