package _12_math;

public class _06_CountDigit {
  public static void main(String[] args) {
    _06_CountDigit obj = new _06_CountDigit();

    /* Handle negative number case */ 

    /* 
      Logarithmic Formulas: 
        1. log<a>xy = log<a>x + log<a>y
        2. log<a>x/y = log<a>x - log<a>y
        3. log<a>x^n = n x log<a>x 
        4. log<a>b = log<c>b / log<c>a
        5. log<a>b = 1 / log<b>a
    */ 

    obj.countDigits(0);
    obj.countDigits(2);
    obj.countDigits(120);

    obj.countDigitsLogarithmic(0);
    obj.countDigitsLogarithmic(2);
    obj.countDigitsLogarithmic(120);
  }

  public int countDigits(long num) {
    int digit = num == 0 ? 1 :  0;
    while (num > 0) {
      num /= 10;
      digit++;
    }
    System.out.println(digit);
    return digit;
  }

  public int countDigitsLogarithmic(long num) {
    // int digit = num == 0 ? 1 :  (int) Math.log10(num) + 1;
    int digit = num == 0 ? 1 : (int) (Math.log(num)/Math.log(10)) + 1; // log<a>b = log<c>b / log<c>a
    
    /*
      10 ^ x = num
      x = log(num) [base 10]
      number of digits = (int) x + 1;
      Note: Math.log10(0) = -Infinity
    */


    System.out.println(digit);
    return digit;
  }
}
