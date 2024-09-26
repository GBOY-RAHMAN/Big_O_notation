public class ArrayInsertAtHeadTimeComplexity {
    public static void main(String[] args) {
        // Test for different sizes of arrays
        for (int size = 1000; size <= 1000000; size *= 10) {
            int[] array = new int[size];

            // Fill the array with integers
            for (int i = 0; i < size; i++) {
                array[i] = i;
            }

            // Measure time for inserting at the head
            long startTime = System.nanoTime();
            
            // Create a new array to simulate insertion at head
            int[] newArray = new int[size + 1];
            newArray[0] = -1;  // Insert new element at the head
            
            //  all elements of the original array to the right
            for (int i = 0; i < size; i++) {
                newArray[i + 1] = array[i];
            }
            
            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("Time taken to insert at head in array of size " + size + ": " + duration + " nanoseconds");
        }
    }
}
