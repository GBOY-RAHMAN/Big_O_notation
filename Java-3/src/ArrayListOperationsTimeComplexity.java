import java.util.ArrayList;

public class ArrayListOperationsTimeComplexity {
    public static void main(String[] args) {
        // Test for different sizes of ArrayLists
        for (int size = 1000; size <= 1000000; size *= 10) {
            ArrayList<Integer> arrayList = new ArrayList<>();

            // Fill the ArrayList with integers
            for (int i = 0; i < size; i++) {
                arrayList.add(i);
            }

            // Measure time for inserting at the head
            long startTime = System.nanoTime();
            arrayList.add(0, -1); // Insert at the head
            long endTime = System.nanoTime();
            long durationInsertHead = endTime - startTime;

            // Measure time for inserting in the middle
            startTime = System.nanoTime();
            arrayList.add(size / 2, -1); // Insert in the middle
            endTime = System.nanoTime();
            long durationInsertMiddle = endTime - startTime;

            // Measure time for inserting at the tail
            startTime = System.nanoTime();
            arrayList.add(-1); // Insert at the tail
            endTime = System.nanoTime();
            long durationInsertTail = endTime - startTime;

            // Measure time for deleting from the head
            startTime = System.nanoTime();
            arrayList.remove(0); // Delete from the head
            endTime = System.nanoTime();
            long durationDeleteHead = endTime - startTime;

            // Measure time for deleting from the middle
            startTime = System.nanoTime();
            arrayList.remove(size / 2); // Delete from the middle
            endTime = System.nanoTime();
            long durationDeleteMiddle = endTime - startTime;

            // Measure time for deleting from the tail
            startTime = System.nanoTime();
            arrayList.remove(arrayList.size() - 1); // Delete from the tail
            endTime = System.nanoTime();
            long durationDeleteTail = endTime - startTime;

            // Print the durations
            System.out.println("Size: " + size);
            System.out.println("Time taken to insert at head: " + durationInsertHead + " nanoseconds");
            System.out.println("Time taken to insert in middle: " + durationInsertMiddle + " nanoseconds");
            System.out.println("Time taken to insert at tail: " + durationInsertTail + " nanoseconds");
            System.out.println("Time taken to delete from head: " + durationDeleteHead + " nanoseconds");
            System.out.println("Time taken to delete from middle: " + durationDeleteMiddle + " nanoseconds");
            System.out.println("Time taken to delete from tail: " + durationDeleteTail + " nanoseconds");
            System.out.println();
        }
    }
}
