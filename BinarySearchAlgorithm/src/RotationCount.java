package BinarySearchAlgorithm.src;
//find the rotation count in rotated sorted array
// https://www.geeksforgeeks.org/dsa/find-rotation-count-rotated-sorted-array/4

public class RotationCount {
  public static void main(String[] args) {
    int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
    System.out.println(countRotations(arr));
  }

  static int countRotations(int[] arr) {
    int pivot = findPivot(arr);
    return pivot + 1;
  }

  // use when array doesnt contain any duplicate elements
  static int findPivot(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      // 4cases here
      if (mid < end && arr[mid] > arr[mid + 1]) {
        return mid;
      }
      if (mid > start && arr[mid] < arr[mid - 1]) {
       
        return mid - 1;
      }
      if (arr[mid] <= arr[start]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return -1;
  }

  // use when array contain duplicate elements
  static int findPivotDuplicate(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      // 4cases here
      if (mid < end && arr[mid] > arr[mid + 1]) {
        return mid;
      }
      if (mid > start && arr[mid] < arr[mid - 1]) {
        return mid - 1;
      }
      // if elements at mid, end, start are equal then skip them
      if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
        if (arr[start] > arr[start + 1]) {
          return start;
        }
        start++;
        if (arr[end] < arr[end - 1]) {
          return end - 1;
        }
        end--;
      } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return -1;
  }
}
