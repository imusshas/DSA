package _12_math;

public class _05_FastExponentiation {
  public static void main(String[] args) {
    // x^n = (x^2)^(n/2); -> If 'n' is EVEN
    // x^n = x * (x^2)^(n-1/2); -> If 'n' is ODD
    _05_FastExponentiation obj = new _05_FastExponentiation();
    obj.calculatePowerByFastExponent(2, 2); // 4
    obj.calculatePowerByFastExponent(2, 7); // 128
  }

  public long calculatePowerByFastExponent(int num, int power) {
    long res = 1;
    while (power > 0) {
      if (power % 2 != 0) {
        res = res * num;
      }

      power /= 2;
      num *= num;
    }
    System.out.println(res);
    return res;
  }

}
