package Sorting.src;

// https://leetcode.com/problems/find-all-duplicates-in-an-array/
import java.util.ArrayList;
import java.util.List;

public class AllDuplicates {
  public static void main(String[] args) {
    int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
    List<Integer> duplicates = findDuplicates(arr);
    System.out.println("Duplicate numbers: " + duplicates);
  }

  static List<Integer> findDuplicates(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      int correct = arr[i] - 1;
      if (arr[i] != arr[correct]) {
        swap(arr, i, correct);
      } else {
        i++;
      }
    }

    List<Integer> duplicates = new ArrayList<>();
    for (int j = 0; j < arr.length; j++) {
      if (arr[j] != j + 1) {
        duplicates.add(arr[j]);
      }
    }
    return duplicates;
  }

  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

}
