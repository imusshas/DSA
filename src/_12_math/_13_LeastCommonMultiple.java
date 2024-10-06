package _12_math;

public class _13_LeastCommonMultiple {
  public static void main(String[] args) {
    // LCM = a x b / gcd(a,b)
    _13_LeastCommonMultiple obj = new _13_LeastCommonMultiple();
    obj.lcm(24, 36);
  }

  public int lcm(int num1, int num2) {
    int lcm = num1 * num2 / gcd(num1, num2);
    System.out.println(lcm);
    return lcm;
  }

  public int gcd(int num1, int num2) {
    while (num1 != 0 && num2 != 0) {
      if (num1 > num2) {
        num1 %= num2;
      } else {
        num2 %= num1;
      }
    }

    if (num1 == 0) {
      num1 = num2;
    }

    return num1;
  }
}
