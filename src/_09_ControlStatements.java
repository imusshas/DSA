import java.util.Scanner;

public class _09_ControlStatements {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Enter a number between 1 to 10: ");
      int numberInput = scanner.nextInt();
      if (numberInput < 1 || numberInput > 10) {
        return;
      }

      ifElse(numberInput);
      switchCase(numberInput);
      
      long factorial = loop(numberInput);
      System.out.println("The factorial of the number is " + factorial);
    }    
  }

  static void ifElse (int number) {
    String evenOdd = null; 
    if (number % 2 == 0) { 
      evenOdd = "Even";
    } else { 
      evenOdd = "Odd";
    }
    System.out.println("The number is " + evenOdd);
  }

  static void switchCase (int number) {
    switch (number) {
      case 1:
        System.out.println("The number is used as unit of measurement");
        break;
      
      case 10: 
      System.out.println("The number is used as the decimal base of count system");
        break;   
        
      default:
      System.out.println("The number is a general number");
        break;
    }
  }

  static long loop (long number) {
    long factorial = 1L;
    for (long i = 1; i <= number; i++) {
      factorial *= i;
    }
    return factorial;
  }
}