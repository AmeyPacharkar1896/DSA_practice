package String.src;
public class Palindrome {
  public static void main(String[] args) {
    String testString = "racecar";
    boolean result = isPalindrome(testString);
    System.out.println("Is \"" + testString + "\" a palindrome? " + result);
    testString = "hello";
    result = isPalindrome(testString);
    System.out.println("Is \"" + testString + "\" a palindrome? " + result);
  }

  static boolean isPalindrome(String str) {
    if (str == null || str.length() == 0) {
      return false;
    }
    
    int left = 0;
    int right = str.length() - 1;
    
    while (left < right) {
      if (str.charAt(left) != str.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }
    
    return true;
  }
}