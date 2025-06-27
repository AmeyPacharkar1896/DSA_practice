package BinarySearchAlgorithm.src;
// 744. Find Smallest Letter Greater Than Target
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

public class SmallestLetter {
  public static void main(String[] args) {
    char[] letters = { 'c', 'f', 'j' };
    char target = 'c';
    char solution = smallestLetter(letters, target);
    System.out.println("The smallest letter which is greater than '" + target + "' is " + solution);
  }

  // return the index
  // return -1 if it doesnt exit
  static char smallestLetter(char[] letters, char target) {
    int start = 0;
    int end = letters.length - 1;

    while (start <= end) {
      // find middle element;
      int mid = start + (end - start) / 2;
      if (target < letters[mid])
        end = mid - 1;
      else
        start = mid + 1;
    }

    return letters[start % letters.length];
  }
}
