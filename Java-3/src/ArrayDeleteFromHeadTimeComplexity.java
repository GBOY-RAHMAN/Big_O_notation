public class ArrayDeleteFromHeadTimeComplexity {
    public static void main(String[] args) {
        // Test for different sizes of arrays
        for (int size = 1000; size <= 1000000; size *= 10) {
            int[] array = new int[size];

            // Fill the array with integers
            for (int i = 0; i < size; i++) {
                array[i] = i;
            }

            // Measure time for deleting from the head
            long startTime = System.nanoTime();
            
            // Create a new array to simulate deletion from the head
            int[] newArray = new int[size - 1];

            // Copy elements from the original array, skipping the first element
            for (int i = 1; i < size; i++) {
                newArray[i - 1] = array[i]; // Start from the second element
            }
            
            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("Time taken to delete from head in array of size " + size + ": " + duration + " nanoseconds");
        }
    }
}
