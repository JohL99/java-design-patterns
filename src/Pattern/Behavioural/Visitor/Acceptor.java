package Pattern.Behavioural.Visitor;

/**
 * This is the interface for the visitor pattern, it defines the accept() method
 */
public interface Acceptor {
    public int accept(Visitor v);
} 
