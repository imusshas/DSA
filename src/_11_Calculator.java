import java.util.Scanner;

public class _11_Calculator {

  public static void main(String[] args) {
    _11_Calculator calculator = new _11_Calculator();

    Scanner scanner = new Scanner(System.in);

    boolean continueFlag = false;

    do {

      if (continueFlag) {
        if (calculator.continueOrNot(scanner) == 'y') {
          continueFlag = false;
        } else {
          break;
        }
      }
      
      String operator = calculator.getOperator(scanner);
      if (operator.equals("Invalid Operation")) {
        System.out.println("Invalid Operation");
        continueFlag = true;
        continue;
      }
    
      Double number1 = calculator.getNumber(scanner, "first");
      if (number1 == null) {
        System.out.println("Invalid Operation");
        continueFlag = true;
        continue;
      }
      Double number2 = calculator.getNumber(scanner, "second");
      if (number2 == null) {
        System.out.println("Invalid Operation");
        continueFlag = true;
        continue;
      }
    
      Double result = calculator.calculate(number1, number2, operator);
      if (result != null) {
        System.out.println(number1 + " " + calculator.getSignFromOperator(operator) + " " + number2 + " = " + Math.round(result * 100.0) / 100.0);
      }
      continueFlag = true;
    } while (true);

    scanner.close();
  }


  private String getOperator(Scanner scanner) {
      
    System.out.println("Please choose an operation: (+, -, *, /, %) ");
    System.out.print("-> ");

    String result = "Invalid Operation";
    try {
      String input = scanner.nextLine();
      char operator = input.charAt(0);

      switch (operator) {
        case '+':
          result = "Addition";
          break;
        case '-':
          result = "Subtraction";
          break;
        case '*':
          result = "Multiplication";
          break;
        case '/':
          result = "Division";
          break;
          
        case '%':
          result = "Modulus";
          break;
        
        default:
        result = "Invalid Operation";
      } 
    } catch (Exception e) {
      result = "Invalid Operation";
      // e.printStackTrace();
    }  
    return result;
  }
  
  private Double getNumber(Scanner scanner, String order) {
    System.out.print("Please enter the " + order + " first number: ");

    Double number = null;
    try {
      number = scanner.nextDouble();
      // I had a lot of headache just because of omitting the next line. Never forget to call nextLine() after nextInt()
      scanner.nextLine();
    } catch(Exception e) {
      System.out.println("Invalid Number");
      // e.printStackTrace();
    }
    return number;
  }

  private Double calculate(Double num1, Double num2, String operation) {
    Double result = null;
    
    switch (operation) {
      case "Addition":
        result =  (num1 + num2);
        break;
      case "Subtraction":
        result =  (num1 - num2);
        break;
      case "Multiplication":
        result =  (num1 * num2);
        break;
      case "Division":
        if (num2 == 0) {
          System.out.println("Cannot divide by zero");
          break;
        }
        result =  (num1 / num2);
        break;
      case "Modulus":
        result =  (num1 % num2);
        break;
    }
    
    return result;
  }

  private char continueOrNot (Scanner scanner) {
    System.out.print("Do you want to continue? (y/n) ");
    char result = 'n';
    try {
      String input = scanner.nextLine();
      result = input.charAt(0);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return result;
  }

  private char getSignFromOperator(String operator) {
    switch (operator) {
      case "Addition":
      case "Add":
        return '+';
      case "Subtraction":
      case "Sub":
        return '-';
      case "Multiplication":
      case "Mul":
        return '*';
      case "Division":
      case "Div":
        return '/';
      case "Modulus":
      case "Mod":
        return '%';
    }
    return ' ';
  }
}
