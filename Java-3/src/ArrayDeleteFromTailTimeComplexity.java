public class ArrayDeleteFromTailTimeComplexity {
    public static void main(String[] args) {
        // Test for different sizes of arrays
        for (int size = 1000; size <= 1000000; size *= 10) {
            int[] array = new int[size];

            // Fill the array with integers
            for (int i = 0; i < size; i++) {
                array[i] = i;
            }

            // Measure time for deleting from the tail
            long startTime = System.nanoTime();
            
            // Create a new array to simulate deletion from the tail
            int[] newArray = new int[size - 1];

            // Copy elements from the original array, skipping the last element
            for (int i = 0; i < size - 1; i++) {
                newArray[i] = array[i]; // Copy all but the last element
            }
            
            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("Time taken to delete from the tail in array of size " + size + ": " + duration + " nanoseconds");
        }
    }
}
