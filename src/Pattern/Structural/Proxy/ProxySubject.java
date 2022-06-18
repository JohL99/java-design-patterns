package Pattern.Structural.Proxy;

/**
 * This class is an example class for the proxy pattern, it implements the commonMethod interface.
 * This class acts as a proxy for the {@link RealSubject} class.
 * This class will handle operations in place of the realSubject class.
 */
public class ProxySubject implements CommonMethod {
    // Private Member
    // This is the realSubject class that will be used by the proxySubject class.
    private RealSubject realSubject;

    /**
     * Constructor for the proxySubject class
     */
    public ProxySubject() {
        realSubject = new RealSubject();
    };


    // Implementation of the commonMethod interface, allowing for the proxySubject class to act in place of the realSubject class.
    @Override
    public String getSecret() {
        // Imagine some processing goes here to check that a user is authenticated or something of that nature
        // Post Validation, now we are going to interact with the real subject, exposing it.
        return realSubject.getSecret();
    }
    
    
}
