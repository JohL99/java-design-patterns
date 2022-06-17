package Pattern.Structural.Adapter;

import java.util.ArrayList;

/**
 * This class implements the {@link Adapter} interface.
 * This class is an example class that adapts the adaptee to the target type / interface.
 *  
 */
public class ConcreteAdapter implements Adapter
{
    // Private Members
    // The adaptee to be adapted.
    private Adaptee adaptee;
    
    /**
     * Constructor for the concreteAdapter.
     */
    public ConcreteAdapter(){adaptee = new Adaptee();}



    // Here we can see the pattern in effect.
    // We are adapting our code to sort an Array even though we only have functionality to sort an ArrayList.
    @Override
    public Integer[] sort_array(Integer[] arr) {
        ArrayList<Integer> p = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++)
        {
            p.add(arr[i]);
        }
        // The active adaption is here.
        p = adaptee.sort_array_list(p);
        Integer[] ret = new Integer[p.size()];
        for(int i = 0; i < p.size(); i++)
        {
            ret[i] = p.get(i);
        }
        return ret;
    };
    
    

}