package Sorting.src;
// https://leetcode.com/problems/set-mismatch/

public class SetMismatch {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 2, 4 };
    int[] result = findErrorNums(arr);
    System.out.println("Duplicate number: " + result[0]);
    System.out.println("Missing number: " + result[1]);
  }

  static int[] findErrorNums(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      int correct = arr[i] - 1;
      if (arr[i] != arr[correct]) {
        swap(arr, i, correct);
      } else {
        i++;
      }
    }

    int[] result = new int[2];
    for (int j = 0; j < arr.length; j++) {
      if (arr[j] != j + 1) {
        result[0] = arr[j]; //duplicate number
        result[1] = j + 1; //missing number
      }
    }
    return result;
  }

  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
