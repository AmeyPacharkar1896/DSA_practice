package LinearSearchAlgorithm.src;
//Q. Search for 3 in the range of index [1, 4]
//arr = [18, 12, -7, 3, 14, 28]

public class SearchInRange {
  public static void main(String[] args) {
    int[] arr = { 18, 12, -7, 3, 14, 28 };
    int target = 3;
    int start = 4;
    int end = 5;
    int index = searchInRange(arr, target, start, end);
    if (index != -1) {
      System.out.println("Element is present at index " + index);
    } else {
      System.out.println("Element is not present in the given range");
    }
  }

  // search for a element in a range of index in a array
  static int searchInRange(int[] arr, int target, int start, int end) {
    if (arr.length == 0) {
      return -1;
    }

    // run a for loop
    for (int i = start; i <= end; i++) {
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
