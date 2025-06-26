package LinearSearchAlgorithm.src;
// 1672. Richest Customer Wealth
// https://leetcode.com/problems/richest-customer-wealth/description/

public class MaxWealth {
  public static void main(String[] args) {

  }

  static public int maximumWealth(int[][] accounts) {
    // person = rol
    // account = col
    int max = 0;
    for (int[] person : accounts) {
      // when we start a new col we make a new sum
      int maxSum = 0;
      for (int account : person) {
        maxSum += account;
      }
      if (maxSum > max) {
        max = maxSum;
      }
    }
    return max;
  }
}
