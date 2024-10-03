package _12_math;

public class _03_StringToNumber {
  public static void main(String[] args) {
    _03_StringToNumber obj = new _03_StringToNumber();
    int number = obj.stringToNumber("536");
    System.out.println(number);
    
    int number2 = obj.stringToNumberApproach2("536");
    System.out.println(number2);
  }

  public int stringToNumber(String str) {
    int number = 0;
    int base = 1;
    for (int i = str.length() - 1; i >= 0; i--) {
      int digit = (str.charAt(i) - '0');
      number += digit * base;
      base *= 10;
    }
    return number;
  }

  public int stringToNumberApproach2(String str) {
    int number = 0;
    int base = 1;
    for (int i = 0; i < str.length(); i++) {
      number = number * base + (str.charAt(i) - '0');
      base = 10;
    }
    return number;
  }
}
