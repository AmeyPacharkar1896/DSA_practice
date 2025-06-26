package LinearSearchAlgorithm.src;
public class SearchInString {
  public static void main(String[] args) {
    String name = "Amey Pacharkar";
    char target = 'm';
    boolean isPresent = search(target, name);
    if (isPresent) {
      System.out.println("Character '" + target + "' found");
    } else {
      System.out.println("Character '" + target + "' not found");
    }
  }

  static boolean search(char target, String str) {
    if (str.length() == 0) {
      return false;
    }

    for (char element : str.toCharArray()) {
      if (element == target) {
        return true;
      }
    }
    return false;
  }
}
