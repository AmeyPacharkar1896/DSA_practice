package basics.src;
import java.util.Scanner;

public class inputs {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name:");
    String name = sc.nextLine();
    System.out.println("Enter your age:");
    int age = sc.nextInt();
    System.out.println("Enter your address:");
    String address = sc.nextLine();
    System.out.println("Enter your phone number:");
    String phone = sc.nextLine();
    System.out.println("Enter your email:");
    String email = sc.nextLine();
    System.out.println("Your name is: " + name);
    System.out.println("Your age is: " + age);
    System.out.println("Your address is: " + address);
    System.out.println("Your phone number is: " + phone);
    System.out.println("Your email is: " + email);
  }
}
