package _12_math;

public class _07_ArmstrongNumber {
  public static void main(String[] args) {
    _07_ArmstrongNumber obj = new _07_ArmstrongNumber();

    obj.armstrongNumber(123);
    obj.armstrongNumber(153);
  }


  public void armstrongNumber(int num) {
    int temp = num;
    int res = 0;

    while(temp > 0) {
      int digit = temp % 10;
      temp /= 10;
      res += digit * digit * digit;
    }

    if (res == num) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
