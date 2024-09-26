public class ArrayAccessByIndexTimeComplexity {
    public static void main(String[] args) {
        // Test for different sizes of arrays
        for (int size = 1000; size <= 1000000; size *= 10) {
            int[] array = new int[size];

            // Fill the array with integers
            for (int i = 0; i < size; i++) {
                array[i] = i;
            }

            // Measure time for accessing an element by index
            long startTime = System.nanoTime();
            
            // Access the last element by its index (O(1) operation)
            int element = array[size - 1];
            
            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("Time taken access the last element by index in array of size " + size + ": " + duration + " nanoseconds");
        }
    }
}
