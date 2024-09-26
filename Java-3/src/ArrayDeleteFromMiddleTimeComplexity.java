public class ArrayDeleteFromMiddleTimeComplexity {
    public static void main(String[] args) {
        // Test for different sizes of arrays
        for (int size = 1000; size <= 1000000; size *= 10) {
            int[] array = new int[size];

            // Fill the array with integers
            for (int i = 0; i < size; i++) {
                array[i] = i;
            }

            // Measure time for deleting from the middle
            long startTime = System.nanoTime();
            
            // Calculate the middle index
            int middleIndex = size / 2;

            // Create a new array to simulate deletion from the middle
            int[] newArray = new int[size - 1];

            // Copy elements from the original array, skipping the middle element
            for (int i = 0; i < size; i++) {
                if (i < middleIndex) {
                    newArray[i] = array[i]; // Copy elements before the middle
                } else if (i > middleIndex) {
                    newArray[i - 1] = array[i]; // Copy elements after the middle, adjusting the index
                }
            }
            
            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("Time taken to delete from the middle in array of size " + size + ": " + duration + " nanoseconds");
        }
    }
}
