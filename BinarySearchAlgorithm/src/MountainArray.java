package BinarySearchAlgorithm.src;
//852. Peak Index in a Mountain Array
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
//array which first increases in the values and then decreases

public class MountainArray {
  public static void main(String[] args) {
    int[] array = { 0, 10, 5, 2 };
    int solution = peakIndexInMountainArray(array);
    System.out.println("The element at '" + solution + "' is the peak of mountain array ");
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
}
