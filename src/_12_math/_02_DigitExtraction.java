package _12_math;

public class _02_DigitExtraction {
  public static void main(String[] args) {
    _02_DigitExtraction obj = new _02_DigitExtraction();
    obj.extractDigit(89);
  }


  public void extractDigit(int number) {
    while(number > 0) {
      int digit = number % 10;
      number /= 10;
      System.out.println(digit);
    }
  }
}
