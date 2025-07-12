package Sorting.src;
public class BubbleSort {
  public static void main(String[] args) {
    int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
    bubble(arr);
    System.out.println("Sorted array");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  static void bubble(int[] arr) {
    boolean swapped = false;
    // run for steps n-1 times
    for (int i = 0; i < arr.length - 1; i++) {
      // for each step,max items will come at the last respective index
      for (int j = 1; j < arr.length - i; j++) {
        // if current element is smaller than previous one then swap them
        if (arr[j] < arr[j - 1]) {
          int temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
          swapped = true;
        }
      }

      // if no swapping occured in the inner loop, then array is sorted
      if (!swapped) {
        break;
      } else {
        swapped = false; // reset swapped for the next iteration
      }
    }
  }
}
