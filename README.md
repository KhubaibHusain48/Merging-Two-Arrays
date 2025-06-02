
---

# 🔀 Merging Two Arrays in Java

This project merges two integer arrays into a single array, then sorts and prints the merged array. It uses a modular design with separate classes for utility functions, merging logic, and the main program.

## 📁 Project Structure

* **`UtilityClass`**: Handles user input to create arrays.
* **`MergingMethod`**: Contains the method to merge two arrays into one.
* **`MainClass`**: Runs the program, calls utility and merging methods, sorts, and prints the final array.

## ⚙️ How It Works

* Takes input for two arrays from the user.
* Merges both arrays into a new array.
* Sorts the merged array.
* Prints the merged and sorted array elements.

## 🚀 How to Run

### Prerequisites

* Java JDK installed (version 8 or above)

### Steps

1. Put the files in a folder named `MergingArrays`:

   * `UtilityClass.java`
   * `MergingMethod.java`
   * `MainClass.java`
2. Compile all files:

   ```bash
   javac MergingArrays/*.java
   ```
3. Run the main program:

   ```bash
   java MergingArrays.MainClass
   ```

## 💡 Sample Run

```
Enter the size of the array: 3
Enter the element 1: 1
Enter the element 2: 4
Enter the element 3: 6
Enter the size of the array: 3
Enter the element 1: 2
Enter the element 2: 3
Enter the element 3: 5
Merged array elements: [1, 2, 3, 4, 5, 6]
```

## 📚 Concepts Covered

* Array input and handling
* Merging two arrays into one
* Sorting arrays using built-in methods
* Modular programming with separate classes
