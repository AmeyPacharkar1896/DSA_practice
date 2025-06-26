package LinearSearchAlgorithm.src;
public class SearchIn2DArray {
  public static void main(String[] args) {
    int[][] arr = {
        { 23, 4, 1 },
        { 18, 12, 3, 9 },
        { 78, 99, 34, 56 },
        { 18, 12 },
    };
    int target = 12;
    int[] result = search(arr, target); // return value will be {row, col}
    if (result != new int[] { -1, -1 }) {
      System.out.println("Element found at (row, col) : (" + result[0] + ", " + result[1] + ")");
    } else {
      System.out.println("Element not found");
    }

    System.out.println(max(arr));
  }

  static int[] search(int[][] arr, int target) {
    if (arr.length == 0) {
      return new int[] { -1, -1 };
    }

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] == target) {
          return new int[] { i, j };
        }
      }
    }
    return new int[] { -1, -1 };
  }

  static int max(int[][] arr) {
    if (arr.length == 0) {
      return Integer.MAX_VALUE;
    }

    int max = Integer.MIN_VALUE;
    for (int[] ints : arr) {
      for (int element : ints) {
        if (element > max) {
          max = element;
        }
      }
    }

    return max;
  }
}