package BinarySearchAlgorithm.src;
public class RowColMatrix {
  public static void main(String[] args) {
    int[][] matrix = {
        { 10, 20, 30, 40 },
        { 15, 25, 35, 45 },
        { 28, 29, 37, 49 },
        { 33, 34, 38, 50 },
    };
    int target = 7;
    int[] result = search(matrix, target);
    if (result[0] != -1) {
      System.out.println("Element " + target + " found at index (" + result[0] + ", " + result[1] + ")");
    } else {
      System.out.println("Element " + target + " not found");
    }
  }

  static int[] search(int[][] matrix, int target) {
    int row = 0;
    int col = matrix.length - 1;

    while (row < matrix.length && col >= 0) {
      if (matrix[row][col] == target) {
        return new int[] { row, col };
      } else if (matrix[row][col] < target) {
        row++;
      } else {
        col--;
      }
    }
    return new int[] { -1, -1 }; // Target not found
  }
}