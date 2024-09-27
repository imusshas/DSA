import java.util.Scanner;

public class _03_Input {

  public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
          System.out.println("Enter your first name:");
          String firstName = sc.next(); // First word
          sc.nextLine();  // Ignore '\n'
          System.out.println("Hi, " + firstName);
          System.out.println("Enter your full name:");
          String name = sc.nextLine();  // First line
          System.out.println("Hi, " + name);
      }
  }
}