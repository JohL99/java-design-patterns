package Pattern.Structural.Adapter;

import java.util.ArrayList;
import java.util.Collections;

/**
 * This class is an example class of an adaptee that contains useful code but is not compatible with a different signature (e.g. a different interface).
 */
public class Adaptee
{
    /**
     * NoArgs constructor.
     */
    public Adaptee(){};
    
    /**
     * This function sorts an {@code ArrayList} of type {@code Integer}.
     * @param p The {@code ArrayList} to be sorted.
     * @return The sorted {@code ArrayList}.
     */
    public ArrayList<Integer> sort_array_list(ArrayList<Integer> p)
    {
    // Simple sort.
    Collections.sort(p);
    return p;
    }
}