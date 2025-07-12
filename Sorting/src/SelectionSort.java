package Sorting.src;
public class SelectionSort {
  public static void main(String[] args) {
    int [] arr = {5, 3, 8, 4, 2};
    selection(arr);
    for(int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  static void selection(int[] arr) {
    for(int i = 0; i < arr.length - 1; i ++) {
      //find the max item in the unsorted array and swap it with the correct item
      int lastIndex = arr.length - i - 1;
      int maxIndex = getMaxIndex(arr, 0, lastIndex);
      
      if(maxIndex != lastIndex) {
        swap(arr, lastIndex, maxIndex);
      }
    }
  }

  static int getMaxIndex(int[] arr, int start, int end) {
    int maxIndex = start;
    for(int i = start; i <= end; i ++) {
      if(arr[i] > arr[maxIndex]) {
        maxIndex = i;
      }
    }
    return maxIndex;
  }

  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
