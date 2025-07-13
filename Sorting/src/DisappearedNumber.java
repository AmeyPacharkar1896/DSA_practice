package Sorting.src;
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumber {
  public static void main(String[] args) {
    int[] arr = { 1, 1 };
    List<Integer> disappearedNumbers = findDisappearedNumbers(arr);
    System.out.println("Disappeared numbers: " + disappearedNumbers);
  }

  static List<Integer> findDisappearedNumbers(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      int correct = arr[i];
      if (arr[i] != arr[correct]) {
        swap(arr, i, arr[i]);
      } else {
        i++;
      }
    }

    // search for first missing number
    List<Integer> disappearedNumber = new ArrayList<Integer>();
    for (int j = 0; j < arr.length; j++) {
      if (arr[j] != j + 1) {
        disappearedNumber.add(j + 1);
        System.out.println("Disappeared number: " + j);
      }
    }

    return disappearedNumber;
  }

  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
