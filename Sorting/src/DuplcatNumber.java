package Sorting.src;
// https://leetcode.com/problems/find-the-duplicate-number/description/

public class DuplcatNumber {
  public static void main(String[] args) {
    int[] arr = { 3, 1, 3, 4, 2 };
    int duplicate = findDuplicate(arr);
    System.out.println("Duplicate number: " + duplicate);
  }

  static int findDuplicate(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      int correct = arr[i];
      if (arr[i] != arr[correct]) {
        swap(arr, i, correct);
      } else {
        i++;
      }
    }
    System.out.println("Array after sorting: " + java.util.Arrays.toString(arr));
    return arr[arr.length - 1];
  }

  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
