public class ArrayInsertAtTailTimeComplexity {
    public static void main(String[] args) {
        // Test for different sizes of arrays
        for (int size = 1000; size <= 1000000; size *= 10) {
            int[] array = new int[size];

            // Fill the array with integers
            for (int i = 0; i < size; i++) {
                array[i] = i;
            }

            // Measure time for inserting at the tail
            long startTime = System.nanoTime();
            
            // Create a new array to simulate insertion at the tail
            int[] newArray = new int[size + 1];

            // Copy all elements from the original array
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i]; // Copy existing elements
            }
            
            // Insert new element at the tail
            newArray[size] = -1;  // Insert new element at the end
            
            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("Time taken to insert at the tail in array of size " + size + ": " + duration + " nanoseconds");
        }
    }
}
