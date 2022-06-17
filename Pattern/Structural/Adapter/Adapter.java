package Pattern.Structural.Adapter;

/**
 * This is an interface for the Adapter pattern
 * This interface defines the methods that the concrete adapter must implement.
 */
public interface Adapter {
    /**
     * This method sorts a given array of integers
     * @param arr The array of integers to be sorted
     * @return The sorted array of integers
     */
    public abstract Integer[] sort_array(Integer[] arr);
}
