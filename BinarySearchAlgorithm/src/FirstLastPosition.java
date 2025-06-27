package BinarySearchAlgorithm.src;
// 34. Find First and Last Position of Element in Sorted Array
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

import java.util.Arrays;

public class FirstLastPosition {
  public static void main(String[] args) {
    int[] array = { 5, 7, 7, 8, 8, 10 };
    int target = 8;
    int[] solution = firstAndLastPosition(array, target);
    System.out.println("The element '" + target + "' is at index " + Arrays.toString(solution));
  }

  // return the index
  // return -1 if it doesnt exit
  static int[] firstAndLastPosition(int[] array, int target) {
    int[] answer = { -1, -1 };
    answer[0] = search(array, target, true);
    answer[1] = search(array, target, false);
    return answer;
  }

  static int search(int[] array, int target, boolean isFirstIndex) {
    int answer = -1;
    int start = 0;
    int end = array.length - 1;

    while (start <= end) {
      // find middle element;
      int mid = start + (end - start) / 2;
      if (target < array[mid])
        end = mid - 1;
      else if (target > array[mid])
        start = mid + 1;
      else {
        answer = mid;
        if (isFirstIndex)
          end = mid - 1;
        else
          start = mid + 1;
      }
    }
    return answer;
  }

}
