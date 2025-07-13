package Sorting.src;
//all questions with 1 to n are cyclic sort
// Time Complexity: O(n)

public class CyclicSort {
  public static void main(String[] args) {
    int[] arr = {3, 1, 5, 4, 2};
    cyclic(arr);
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  static void cyclic(int[] arr) {
    int i = 0;
    while (i < arr.length - 1) {
      if (arr[i] != i + 1) {
        int temp = arr[i];
        arr[i] = arr[temp - 1];
        arr[temp - 1] = temp;
      } else {
        i++;
      }
    }
  }
}
