# Time Complexity Measurements for Array and ArrayList Operations

## Overview
This project demonstrates the time complexity of various operations on arrays and `ArrayList` in Java, including insertion and deletion at different positions (head, middle, and tail). The measurements are performed using Java's `System.nanoTime()` method to provide precise time tracking for each operation across varying sizes of data structures.

## Operations Covered
1. **Insertion**
   - **At the Head**: Measures the time taken to insert an element at the beginning of the structure.
   - **In the Middle**: Measures the time taken to insert an element at the middle position.
   - **At the Tail**: Measures the time taken to insert an element at the end of the structure.

2. **Deletion**
   - **From the Head**: Measures the time taken to remove the first element.
   - **From the Middle**: Measures the time taken to remove the element at the middle position.
   - **From the Tail**: Measures the time taken to remove the last element.

## Complexity Analysis
- **Arrays**:
  - Insertion at Head: O(n)
  - Insertion in Middle: O(n)
  - Insertion at Tail: O(n) (due to the need to create a new array)
  - Deletion from Head: O(n)
  - Deletion from Middle: O(n)
  - Deletion from Tail: O(n) (due to the need to create a new array)

- **ArrayList**:
  - Insertion at Head: O(n)
  - Insertion in Middle: O(n)
  - Insertion at Tail: O(1) (amortized)
  - Deletion from Head: O(n)
  - Deletion from Middle: O(n)
  - Deletion from Tail: O(1)

## Implementation
The code implementation includes methods to perform each operation and measure the execution time. It showcases how the choice of data structure impacts performance and complexity for common operations.

## Usage
Clone the repository and run the `ArrayOperationsTimeComplexity` class to observe the time taken for each operation as the size of the array or `ArrayList` increases. Modify the sizes and operations as needed to explore the performance characteristics further.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
