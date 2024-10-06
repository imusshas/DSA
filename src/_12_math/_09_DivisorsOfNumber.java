package _12_math;

import java.util.ArrayList;

public class _09_DivisorsOfNumber {
  public static void main(String[] args) {
    _09_DivisorsOfNumber obj = new _09_DivisorsOfNumber();

    obj.divisors(36);
  }


  public ArrayList<Integer> divisors(int num) {

    ArrayList<Integer> divisors = new ArrayList<>(); 
    divisors.add(1);
    
    for (int i = 2; i * i <= num; i++) {
      if (num % i == 0) {
        if (num / i == i ) {
          divisors.add(i);
        } else {
          divisors.add(i);
          divisors.add(num / i);
        }
      }
    }

    divisors.add(num);

    divisors.sort(null);
    
    for (Integer number : divisors) {
      System.out.println(number);
    }

    return divisors;
  }
}
