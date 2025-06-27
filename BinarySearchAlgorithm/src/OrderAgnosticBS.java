package BinarySearchAlgorithm.src;
public class OrderAgnosticBS {
  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5, 8, 10, 12, 44, 55, 61 };
    int target = 44;
    int solution = orderAgnosticBS(array, target);
    System.out.println("The element '" + target + "' is at index " + solution);
    int[] array1 = { 61, 55, 44, 12, 10, 8, 5, 4, 3, 2, 1 };
    target = 44;
    solution = orderAgnosticBS(array1, target);
    System.out.println("The element '" + target + "' is at index " + solution);

  }

  static int orderAgnosticBS(int[] array, int target) {
    int start = 0;
    int end = array.length - 1;

    // find if array is sorted in ascending or descending
    boolean isAscending = array[start] < array[end];

    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (array[mid] == target)
        return mid;
      if (isAscending) {
        if (target < array[mid])
          end = mid - 1;
        else if (target > array[mid])
          start = mid + 1;
      } else {
        if (target > array[mid])
          end = mid - 1;
        else if (target < array[mid])
          start = mid + 1;
      }
    }
    return -1;
  }
}
