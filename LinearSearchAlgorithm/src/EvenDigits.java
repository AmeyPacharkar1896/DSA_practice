package LinearSearchAlgorithm.src;
// 1295. Find Numbers with Even Number of Digits
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class EvenDigits {
  public static void main(String[] args) {
    int[] nums = { 12, 345, 2, 6, 7896 };
    System.out.println(findNumbers(nums));
  }

  static public int findNumbers(int[] nums) {
    int count = 0;
    for (int num : nums) {
      if (even(num)) {
        count++;
      }
    }
    return count;
  }

  // function to check if a number contains even number of digits
  static boolean even(int num) {
    int numberOfDigits = countDigit(num);
    return numberOfDigits % 2 == 0;
    // if (count % 2 == 0) {
    // return true;
    // } else {
    // return false;
    // }
  }

  static int countDigit(int num) {
    if (num < 0) {
      num = -num;
    }
    if (num == 0) {
      return 1;
    }
    return (int) (Math.log10(num) + 1);
  }

  // static int countDigit(int num) {
  // if (num < 0) {
  // num = num * -1;
  // }

  // if (num == 0) {
  // return 1;
  // }

  // int count = 0;
  // while (num > 0) {
  // count++;
  // num /= 10;
  // }
  // return count;
  // }
}
