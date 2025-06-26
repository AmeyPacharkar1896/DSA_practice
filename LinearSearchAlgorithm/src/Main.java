package LinearSearchAlgorithm.src;
//Linear Search Algorithm
//In Linear Search, we iterate over all the elements of 
// the array and check if it the current element is equal 
// to the target element. If we find any element to be equal 
// to the target element, then return the index of the 
// current element. Otherwise, if no element is equal to 
// the target element, then return -1 as the element is 
// not found. Linear search is also known as sequential 
// search.

//Best case - 0(1), Worst case - 0(n)

//Q. find the number 14 exists in array or not
//arr = [18, 12, 9, 14, 77, 50]

public class Main {
  public static void main(String[] args) {
    int[] nums = { 23, 45, 1, 2, 8, 19, -3, 16, -11, 28 };
    int target = 129;
    int result = linearSearchForIndex(nums, target);
    if (result != -1 || result != Integer.MAX_VALUE) {
      System.out.println("Element is present at index " + result);
    } else {
      System.out.println("Element is not present in array");
    }
  }

  // search in the array: return if true or false
  static boolean linearSearchForBool(int[] arr, int target) {
    if (arr.length == 0) {
      return false;
    }

    // run a for loop
    for (int element : arr) {
      if (element == target) {
        return true;
      }
    }
    // if no element is equal to target then return false
    return false;
  }


  // search in the array: return the element if item found
  static int linearSearchForElement(int[] arr, int target) {
    if (arr.length == 0) {
      return -1;
    }

    // run a for loop
    for (int element : arr) {
      if (element == target) {
        return element;
      }
    }
    // if no element is equal to target then return -1
    return Integer.MAX_VALUE;
  }


  // search in the array: return the index if item found
  // otherwise if item not found return -1
  static int linearSearchForIndex(int[] arr, int target) {
    if (arr.length == 0) {
      return -1;
    }

    // run a for loop
    for (int i = 0; i < arr.length; i++) {
      // check for element at every index if it is == target
      int element = arr[i];
      if (element == target) {
        return i;
      }
    }
    // if no element is equal to target then return -1
    return -1;
  }
}
