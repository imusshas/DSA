package _12_math;

public class _04_ReverseNumber {

  public static void main(String[] args) {
    _04_ReverseNumber obj = new _04_ReverseNumber();
    obj.evenOdd(0); //Even
    obj.evenOdd(1); // Odd

    obj.reverseNumber(123); // 321
    obj.reverseNumber(560); // 65
    
    obj.calculatePower(10, 3);  // 1000
    obj.calculatePower(2, 8);  // 256
  }


  public String evenOdd(int number) {
    String result = number % 2 == 0 ? "Even" : "Odd";
    System.out.println(result);
    return result;
  }

  public long calculatePower(int num, int power) {
    long res = 1;
    for (int i = 0; i < power; i++) {
      res *= num;
    }
    System.out.println(res);
    return res;
  }

  public int reverseNumber(int number) {
    int reverse = 0;
    while (number > 0) {
      int lastDigit = number % 10;
      number /= 10;
      reverse = (reverse * 10) + lastDigit;
    }
    System.out.println(reverse);
    return reverse;
  }
  
}
