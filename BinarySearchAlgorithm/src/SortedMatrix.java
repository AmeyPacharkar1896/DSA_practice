public class SortedMatrix {
  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 },
        { 13, 14, 15, 16 }
    };
    int target = 9;
    int[] result = search(matrix, target);
    if (result[0] != -1) {
      System.out.println("Target found at: (" + result[0] + ", " + result[1] + ")");
    } else {
      System.out.println("Target not found in the matrix.");
    }
  }

  // search in the row provided between colStart and colEnd
  static int[] binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target) {

    while (colStart <= colEnd) {
      int mid = colStart + (colEnd - colStart) / 2;
      if (matrix[row][mid] == target) {
        return new int[] { row, mid }; // Found the target
      } else if (matrix[row][mid] < target) {
        colStart = mid + 1; // Search in the right half
      } else {
        colEnd = mid - 1; // Search in the left half
      }
    }
    return new int[] { -1, -1 }; // Target not found
  }

  static int[] search(int[][] matrix, int target) {
    int row = matrix.length;
    int col = matrix[0].length; // be cautious of empty matrix

    if (row == 1) {
      return binarySearch(matrix, 0, 0, col - 1, target);
    }
    int rStart = 0;
    int rEnd = row - 1;
    int cMid = col / 2;

    // run the loop till two rows are left
    while (rStart < rEnd - 1) { // while this is true we will have 2 rows left
      int mid = rStart + (rEnd - rStart) / 2;
      if (matrix[mid][cMid] == target) {
        return new int[] { mid, cMid }; // Found the target
      } else if (matrix[mid][cMid] < target) {
        rStart = mid; // Search in the lower half
      } else {
        rEnd = mid; // Search in the upper half
      }
    }

    // Now we have two rows left, we can search in both rows
    // check whether the target is in the column of the two row
    if (matrix[rStart][cMid] == target) {
      return new int[] { rStart, cMid };
    } else if (matrix[rStart + 1][cMid] == target) {
      return new int[] { rStart + 1, cMid };
    }

    // search in the first half
    if (target <= matrix[rStart][cMid - 1]) {
      return binarySearch(matrix, rStart, 0, cMid - 1, target);
    }
    // search in the second half
    if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][col - 1]) {
      return binarySearch(matrix, rStart, cMid + 1, col - 1, target);
    }
    // search in the third half
    if (target <= matrix[rStart + 1][cMid - 1]) {
      return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
    }
    // search in the fourth half
    else if (target >= matrix[rStart + 1][cMid + 1] && target <= matrix[rStart + 1][col - 1]) {
      return binarySearch(matrix, rStart + 1, cMid + 1, col - 1, target);
    }

    // If we reach here, the target is not found in the matrix
    return new int[] { -1, -1 }; // Target not found
  }
}
