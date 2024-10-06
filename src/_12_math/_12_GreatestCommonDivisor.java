package _12_math;

public class _12_GreatestCommonDivisor {
  public static void main(String[] args) {
    /*
    Euclidean GCD
      gcd(a,b) = gcd(a-b, b)
      if (a == 0) return b;
      
      gcd(24, 36)
      -> gcd(36, 24)
      -> gcd(36 - 24, 24)
      -> gcd(12, 24)
      -> gcd(24, 12)
      -> gcd(24 - 12, 12)
      -> gcd(12, 12)
      -> gcd(12 - 12, 12)
      -> gcd(0, 12)
      Therefore, 12 is the GCD.

      gcd(9,2)
      -> gcd(9-2, 2)
      -> gcd(7,2)
      -> gcd(7-2, 2)
      -> gcd(5,2)
      -> gcd(5-2,2)
      -> gcd(3,2)
      -> gcd(3-2,2)
      -> gcd(1,2)
      -> gcd(2,1)
      -> gcd(2-1,1)
      -> gcd(1,1)
      -> gcd(1-1, 1)
      -> gcd(0,1)
      Therefore, 1 is the GCD.

    Optimization:
      gcd(24, 36)
      -> gcd(36, 24)
      -> gcd(36%24, 24)
      -> gcd(12, 24)
      -> gcd(24, 12)
      -> gcd(24%12, 12);
      -> gcd(0, 12)
      Therefore, 12 is the GCD.

      gcd(9,2)
      -> gcd(9%2,2)
      -> gcd(1,2)
      -> gcd(2,1)
      -> gcd(2%1,1)
      -> gcd(0,1)
      Therefore, 1 is the GCD.
    */ 

    _12_GreatestCommonDivisor obj = new _12_GreatestCommonDivisor();

    System.out.println("GCD:");
    obj.gcd(36, 24); // 12
    obj.gcd(30, 36); // 6
    obj.gcd(12, 13); // 1
    obj.gcd(0, 5);   // 5

    System.out.println("Euclidean GCD:");
    obj.euclideanGCD(24, 36); // 12
    obj.euclideanGCD(30, 36); // 6
    obj.euclideanGCD(9, 2); // 1
    obj.euclideanGCD(0, 5); // 5

    System.out.println("Euclidean GCD Recursive:");
    obj.euclideanGCDRecursive(24, 36); // 12
    obj.euclideanGCDRecursive(30, 36); // 6
    obj.euclideanGCDRecursive(9, 2); // 1
    obj.euclideanGCDRecursive(0, 5); // 5

    System.out.println("Euclidean GCD Optimized:");
    obj.euclideanGCDOptimized(24, 36);  // 12
    obj.euclideanGCDOptimized(30, 36);  // 6
    obj.euclideanGCDOptimized(9, 2);  // 1
    obj.euclideanGCDOptimized(0, 5);  // 5

    System.out.println("Euclidean GCD Optimized Recursive:");
    obj.euclideanGCDOptimizedRecursive(24, 36);  // 12
    obj.euclideanGCDOptimizedRecursive(30, 36);  // 6
    obj.euclideanGCDOptimizedRecursive(9, 2);  // 1
    obj.euclideanGCDOptimizedRecursive(0, 5);  // 5


    // System.out.println(24 % 0);
  }

  public int gcd(int num1, int num2) {
    int min = num1 > num2 ? num2 : num1;
    int max = num1 > num2 ? num1 : num2;

    int gcd = max;

    for(int i = 1; i * i <= min; i++) {
      if(min % i == 0) {
        int factor = min / i;
        if (max % factor == 0) {
          gcd = factor;
          break;
        } else if (max % i == 0) {
          gcd = i;
        }
      }
    }
    System.out.println(gcd);
    return gcd;
  }

  public int euclideanGCD(int num1, int num2) {

    while(num1 != 0 && num2 != 0) {
      if (num1 > num2) {
        num1 -= num2;
      } else {
        num2 -= num1;
      }
    }
    if (num1 == 0) {
      
    num1 = num2;
    }

    System.out.println(num1);
    return num1;
  }

  public int euclideanGCDRecursive(int num1, int num2) {

    if (num2 == 0) {
      System.out.println(num1);
      return num1;
    }

    if (num1 == 0) {
      System.out.println(num2);
      return num2;
    }

    if(num1 > num2) {
      num1 -= num2;
    } else {
      num2 -= num1;
    }

    return euclideanGCDRecursive(num1, num2);
  }

  public int euclideanGCDOptimized(int num1, int num2) {

    while(num1 != 0 && num2 != 0) {
      if (num1 > num2) {
        num1 %= num2;
      } else {
        num2 %= num1;
      }
    }
    
    if (num1 == 0) {
      num1 = num2;
    }

    System.out.println(num1);
    return num1;
  }

  public int euclideanGCDOptimizedRecursive(int num1, int num2) {

    if (num2 == 0) {
      System.out.println(num1);
      return num1;
    }

    if (num1 == 0) {
      System.out.println(num2);
      return num2;
    }

    if(num1 > num2) {
      num1 %= num2;
    } else {
      num2 %= num1;
    }

    return euclideanGCDOptimizedRecursive(num1, num2);
  }
}