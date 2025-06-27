package BinarySearchAlgorithm.src;
//1095. Find in Mountain Array
//https://leetcode.com/problems/find-in-mountain-array/description/

public class SearchInMountain {
  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5, 3, 1 };
    int target = 3;
    int solution = search(array, target);
    System.out.println("The element '" + target + "' is at index " + solution);

  }

  static int search(int[] arr, int target) {
    int peak = peakIndexInMountainArray(arr);
    int firstTry = binarySearch(arr, target, 0, peak);
    if (firstTry != -1) {
      return firstTry;
    }
    return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
  }

  static public int peakIndexInMountainArray(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    while (start < end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] > arr[mid + 1]) {
        end = mid;
      } else {
        start = mid + 1;
      }
    }
    return start;
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

  static int orderAgnosticBS(int[] array, int target, int start, int end) {
    // find if array is sorted in ascending or descending
    boolean isAscending = array[start] < array[end];

    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (array[mid] == target)
        return mid;
      if (isAscending) {
        if (target < array[mid])
          end = mid - 1;
        else if (target > array[mid])
          start = mid + 1;
      } else {
        if (target > array[mid])
          end = mid - 1;
        else if (target < array[mid])
          start = mid + 1;
      }
    }
    return -1;
  }
}
