package BinarySearchAlgorithm.src;
// 410. Split Array Largest Sum
// https://leetcode.com/problems/split-array-largest-sum/description/

public class SplitArray {
  public static void main(String[] args) {
    int[] nums = { 7, 2, 5, 10, 8 };
    int m = 2;
    System.out.println(splitArray(nums, m));
  }

  static public int splitArray(int[] nums, int k) {
    int start = 0;
    int end = 0;

    for (int i = 0; i < nums.length; i++) {
      start = Math.max(start, nums[i]); // in the end of the loop this will have the max number in the array
      end += nums[i]; // this will have the sum of all the numbers in the array
    }

    // binary search
    while (start < end) {
      // try for middle as potential ans
      int mid = start + (end - start) / 2;

      // calculate how many pieces you can divide in with this max sum
      int sum = 0;
      int pieces = 1;
      for (int num : nums) {
        if (sum + num > mid) {
          // you cannot add this in this subarray, make new one
          sum = num;
          pieces++;
        } else {
          sum += num;
        }
      }

      if (pieces > k) {
        start = mid + 1;
      } else {
        end = mid;
      }
    }
    return end; // return end or start
  }
}
