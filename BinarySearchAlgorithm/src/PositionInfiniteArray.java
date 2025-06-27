package BinarySearchAlgorithm.src;
//find the position of the element in an infinite array
// https://www.geeksforgeeks.org/dsa/find-position-element-sorted-array-infinite-numbers/

public class PositionInfiniteArray {
  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5, 7, 8, 9, 10, 12, 44, 55, 61, 90, 100, 130, 140, 160, 170 };
    int target = 160;
    int solution = infiniteArray(array, target);
    System.out.println("The element '" + target + "' is at index " + solution);
  }

  static int infiniteArray(int[] array, int target) {
    int start = 0;
    int end = 1;
    while (target > array[end]) {
      int newStart = end++;
      end += 2 * (end - start + 1);
      start = newStart;
    }
    return binarySearch(array, target, start, end);
  }

  static int binarySearch(int[] array, int target, int start, int end) {

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
