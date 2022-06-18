package Pattern.Structural.Proxy;

/**
 * This is an example class for the proxy pattern.
 * This class is the real subject in our pattern, it is acted upon or called upon by a proxy.
 * This class is the subject that we want to proxy.
 */
public class RealSubject implements CommonMethod {
    
    /**
     * NoArgs Constructor for the realSubject class
     */
    public RealSubject(){};
    @Override
    public String getSecret()
    {
        return "secret";
    }
    
}
