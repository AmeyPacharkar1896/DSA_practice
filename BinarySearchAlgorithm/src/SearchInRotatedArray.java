package BinarySearchAlgorithm.src;
// Search in Rotated Sorted Array

//https://leetcode.com/problems/search-in-rotated-sorted-array/description/

public class SearchInRotatedArray {
  public static void main(String[] args) {
    int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
    System.out.println(search(arr, 0));
    // Output: true
  }

  static public int search(int[] nums, int target) {
    int pivot = findPivot(nums);

    // if we didnt find the pivot, that means the array is not rotated
    if (pivot == -1) {
      return binarySearch(nums, target, 0, nums.length - 1);
    }

    // if pivot is found you have found two ascending arrays
    if (nums[pivot] == target) {
      return pivot;
    }
    if (target >= nums[0]) {
      return binarySearch(nums, target, 0, pivot - 1);
    }
    return binarySearch(nums, target, pivot + 1, nums.length - 1);
  }

  // not work for duplicate values
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

  // can be used for duplicate elements
  static int findPivotDuplicate(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;

      // Case 1
      if (mid < end && arr[mid] > arr[mid + 1]) {
        return mid;
      }

      // Case 2
      if (mid > start && arr[mid] < arr[mid - 1]) {
        return mid - 1;
      }

      // Case 3: if elements at start, mid, and end are equal, skip duplicates safely
      if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
        // Check for pivot at start
        if (start + 1 < arr.length && arr[start] > arr[start + 1]) {
          return start;
        }
        start++;

        // Check for pivot at end
        if (end - 1 >= 0 && arr[end] < arr[end - 1]) {
          return end - 1;
        }
        end--;
      }
      // Case 4: Left side is sorted, so pivot must be on right
      else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return -1;
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
