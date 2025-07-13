package Sorting.src;
// https://leetcode.com/problems/missing-number/description/

public class MissingNumber {
  public static void main(String[] args) {
    int[] arr = { 3, 0, 1 };
    int missing = missingNumber(arr);
    System.out.println("Missing number: " + missing);
  }

  static int missingNumber(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      int correct = arr[i];
      if (arr[i] < arr.length && arr[i] != arr[correct]) {
        swap(arr, i, arr[i]);
      } else {
        i++;
      }
    }

    // search for first missing number
    for (int j = 0; j < arr.length; j++) {
      if (arr[j] != j) {
        return j;
      }
    }

    return arr.length;
  }

  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
