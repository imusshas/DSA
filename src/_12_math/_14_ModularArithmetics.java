package _12_math;

public class _14_ModularArithmetics {
  public static void main(String[] args) {
    /*
      1. ((a % m) + (b % m)) % m = (a + b) % m
      2. ((a % m) - (b % m)) % m = (a - b) % m
      3. ((a % m) x (b % m)) % m = (a x b) % m
      4. (a % m) % m = a % m
      5. m % m = 1  [for all positive integers]
      6. (a % m) * (b ^ -1 % m) = (a * b ^ -1) % m = (a / b) % m 

      7. What is modular multiplicative inverse?

        if a * b = 1
        then b is multiplicative inverse of a
        b = a ^ -1

        if
        (a * b) % m = 1
        then "b" is modular multiplicative inverse [MMI] of "a".
        here, b = [1, m-1)

        Now,
        (a * b) % m = 1
        -> ((a * m) * (b % m)) % m = 1
        -> Loop 1 to m - 1:
          -> if ((a * b) % m = 1) 
             then, "b" is the MMI.

        Fermat's Little Theorem:
          a ^ (m - 1) = 1 % m; [m is prime, m % a != 0]
          ->  a ^ (m - 2) = A ^ -1 % m
          ->  a ^ (m - 2) % m = A ^ -1

        Extended Euclidean Algorithm:
          a ^ (m - 1) = 1 % m; [m is non-prime, m % a != 0]
          


      8. When does MMI exist?

        if gcd(a, m) = 1. [ a and m are co-prime]
    */

    _14_ModularArithmetics obj = new _14_ModularArithmetics();
    obj.fastExponentiationWithModularArithmeticOfMultiplication(2, 8, 1_000_000_007);
    obj.fastExponentiationWithModularArithmeticOfMultiplication(1234567, 5, 1_000_000_007);
    obj.fastExponentiationWithModularArithmeticOfMultiplication(123456789, 8, 1_000_000_007);
    obj.fastExponentiationWithModularArithmeticOfMultiplication(2, 8, 107);

    obj.modularMultiplicativeInverse(2, 7);
    obj.modularMultiplicativeInverseOptimized(2, 7);
    obj.modularMultiplicativeInverseOptimized(3, 7);
    obj.modularMultiplicativeInverseOptimized(11, 26);
  }

  public long fastExponent(long number, long power) {
    long result = 1;
    while (power > 0) {
      if (power % 2 != 0) {
        result *= number;
      }
      number *= number;
      power /= 2;
    }
    return result;
  }

  public long fastExponentiationWithModularArithmeticOfMultiplication(long number, long power, long range) {
    System.out.println(number + "^" + power + " :" );
    System.out.println("Without Modular Arithmetic: " + fastExponent(number, power));
    long result = 1;
    while (power > 0) {
      if (power % 2 != 0) {
        result = ((result % range) * (number % range)) % range;
        // result = result * number;
      }
      number = ((number % range) * (number % range)) % range;
      // number = number * number;
      power /= 2;
      // System.out.println("number = " + number + " power: " + power + " result = " + result);
    }
    System.out.println("With Modular Arithmetic (range = " + range + "):" + result);
    return result;
  }


  public int gcd (int num1, int num2) {
    if (num1 == 0) {
      return num2;
    }

    if (num2 == 0) {
      return num1;
    }

    if (num1 > num2) {
      num1 %= num2;
    } else {
      num2 %= num1;
    }

    return gcd(num1, num2);
  }

  public int modularMultiplicativeInverse(int a, int m) {
    int mmi = 1;
    if (gcd(a, m) != 1) {
      System.out.println("MMI doesn't exist.");
      return mmi;
    }
    for (int i = 1; i < m; i++) {
      if ((a * i) % m == 1) {
        mmi = i;
        break;
      }
    }
    System.out.println("MMI = " +  mmi);
    return mmi;
  }

  public boolean isPrime(int m) {
    
    for (int i = 2; i * i <= m; i++) {
      if (m % i == 0) {
        return false;
      }
    }

    return true;
  }

  public int extendedEuclideanMMI(int a, int m) {
    int g = m / a;
    int r1 = m;
    int r2 = a;
    int r = m % a;
    int t1 = 0;
    int t2 = 1;
    int t = t1 - (g * t2);
    
    while (r != 0) {
      r1 = r2;
      r2 = r;
      g = r1 / r2;
      r = r1 % r2;
      t1 = t2;
      t2 = t;
      t = t1 - (g * t2);

      // System.out.println("g = " + g + " r1 = " + r1 + " r2 = " + r2 + " r = " + r + " t1 = " + t1 + " t2 = " + t2 + " t = " + t);
    }
    if (t2 < 0) {
      t2 += m;
    }
    return t2;
  }


  public int modularMultiplicativeInverseOptimized(int a, int m) {
    int mmi = 1;
    if (gcd(a, m) != 1) {
      System.out.println("MMI doesn't exist");
      return mmi;
    }

    if (!isPrime(m)) {
      mmi = extendedEuclideanMMI(a, m);
    } else {
      mmi = (int) fastExponent(a, m -2) % m;
    }

    System.out.println("MMI = " + mmi);
    return mmi;
  }
}
