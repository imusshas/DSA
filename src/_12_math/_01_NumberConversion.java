package _12_math;

public class _01_NumberConversion {
  public static void main(String[] args) {
    _01_NumberConversion obj = new _01_NumberConversion();
    obj.anyBaseToDecimal(0b1001, 2); // 9
    obj.anyBaseToDecimal(070, 8); // 56
    obj.anyBaseToDecimal(0x53, 16); // 83

    System.out.println("2nd Approach: ");
    obj.anyBaseToDecimal(0b1001, 2); // 9
    obj.anyBaseToDecimal(070, 8); // 56
    obj.anyBaseToDecimal(0x53, 16); // 83

    obj.decimalToAnyBase(9, 2); // 0b1001
    obj.decimalToAnyBase(56, 8); // 070
    obj.decimalToAnyBase(83, 16); // 0x53

    System.out.println("2nd Approach: ");
    obj.decimalToAnyBaseApproach2(9, 2); // 0b1001
    obj.decimalToAnyBaseApproach2(56, 8); // 070
    obj.decimalToAnyBaseApproach2(83, 16); // 0x53
  }

  public int anyBaseToDecimal(int number, int base) {
    int increment = 1;
    int decimal = 0;

    while (number > 0) {
      int digit = number % base;
      number = number / base;
      decimal = decimal + digit * increment;
      increment = increment * base;
    }
    System.out.println(decimal);
    return decimal;
  }

  public int anyBaseToDecimalApproach2(int number, int base) {
    int result = 0;
    int power = 1;
    while (number > 0) {
      int lastDigit = number % base;
      number /= base;
      result += lastDigit * power;
      power *= 10;
    }
    
    System.out.println(result);
    return result;
  }

  public void decimalToAnyBase(int number, int base) {
    int[] digits = new int[256];
    int index = 0;

    while (number > 0) {
      digits[index++] = number % base;
      number = number / base;
    }
    switch (base) {
      case 2:
        System.out.print("0b");
        break;

      case 8:
        System.out.print("0");
        break;

      case 16:
        System.out.print("0x");
        break;
    }
    for (int i = index - 1; i >= 0; i--) {
      System.out.print(digits[i]);
    }
    System.out.println();
  } 

  public int decimalToAnyBaseApproach2(int number, int base) {
    int result = 0;
    int power = 1;
    while (number > 0) {
      int modulo = number % base;
      number /= base;
      result += modulo * power;
      power *= 10;
    }
    switch (base) {
      case 2:
        System.out.print("0b");
        break;

      case 8:
        System.out.print("0");
        break;

      case 16:
        System.out.print("0x");
        break;
    }
    System.out.println(result);
    return result;
  }
}
