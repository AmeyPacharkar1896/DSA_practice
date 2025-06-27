package BinarySearchAlgorithm.src;
//Binary Search Algorithm
// Binary Search Algorithm is a searching algorithm used 
// in a sorted array by repeatedly dividing the search 
// interval in half. The idea of binary search is to use 
// the information that the array is sorted and reduce the
//  time complexity to O(log N). 

public class Main {
  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5, 8, 10, 12, 44, 55, 61 };
    int target = 44;
    int solution = binarySearch(array, target);
    System.out.println("The element '" + target + "' is at index " + solution);
  }

  // return the index
  // return -1 if it doesnt exit
  static int binarySearch(int[] array, int target) {
    int start = 0;
    int end = array.length - 1;

    while (start <= end) {
      // find middle element;
      int mid = start + (end - start) / 2;
      if (target < array[mid])
        end = mid - 1;
      else if (target > array[mid])
        start = mid + 1;
      else
        return mid;
    }

    return -1;
  }
}
