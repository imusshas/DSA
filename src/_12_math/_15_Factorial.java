package _12_math;

public class _15_Factorial {

  private static int SIZE = 107;
  private static long[] factorials = new long[SIZE];

  private _15_Factorial() {
    factorials[0] = 1;
    factorialDP(SIZE - 1);
  }

  public static void main(String[] args) {
    _15_Factorial obj = new _15_Factorial();
    obj.factorial(5);
    obj.factorial(20);
    obj.factorialDP(20);
    obj.trailingZerosInFactorial(15);
    obj.trailingZerosInFactorial(34);
    obj.trailingZerosInFactorial(1_000_000_000);
  }

  public long factorial(int num) {
    int fact = num;
    for (int i = 1; i < num; i++) {
      fact *= i;
    }
    System.out.println(fact);
    return fact;
  }

  public long factorialDP(int num) {
    if (factorials[num] != 0) {
      System.out.println(factorials[num]);
      return factorials[num];
    }
    for (int i = 1; i <= num; i++) {
      factorials[i] = i * (factorials[i - 1] % 1_000_000_007);
      // System.out.println("i = " + i + " factorial = " + factorials[i]);
    }
    return factorials[num];
  }

  public int trailingZerosInFactorial(int number) {
    int zeros = 0;
    int divisor = 5;
    while (number > divisor) {
      zeros += number / divisor;
      divisor *= 5;
    }
    System.out.println(zeros);
    return zeros;
  }

}
