package _12_math;

public class _08_PalindromeNumber {
  public static void main(String[] args) {
    _08_PalindromeNumber obj = new _08_PalindromeNumber();

    obj.palindromeNumber(123);
    obj.palindromeNumber(121);
  }

  public void palindromeNumber(int num) {
    int temp = num;
    int reverse = 0;

    while (temp > 0) {
      int digit = temp % 10;
      temp /= 10;

      reverse = reverse * 10 + digit;
    }

    if (reverse == num) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
