package _12_math;

import java.util.ArrayList;;

public class _10_PrimeNumber {

  public static void main(String[] args) {
    _10_PrimeNumber obj = new _10_PrimeNumber();

    obj.primeNumber(1);
    obj.primeNumber(101);
    obj.primeNumber(14);

    obj.sieve(41);
  }

  public void primeNumber(int num) {
    if (num == 1) {
      System.out.println("Not Prime");
      return;
    }

    for (int i = 2; i * i <= num; i++) {
      if (num % i ==0) {
        System.out.println("Not prime");
        return;
      }
    }

    System.out.println("Prime");
  }
  

  public ArrayList<Integer> sieve(int num) {
    ArrayList<Integer> primes = new ArrayList<>();
    primes.add(2);

    boolean[] sieve = new boolean[num + 1];

    for (int i = 3; i * i <= num; i += 2) {
      if (!sieve[i]) {
        for (int j = i * i; j < sieve.length; j += i+ i) {
          sieve[j] = true;
        }
      }
    }

    for (int i = 3; i < sieve.length; i += 2) {

      if (!sieve[i]) {
        primes.add(i);
      }
    }

    for (int i = 0; i < primes.size(); i++) {
      if (i == primes.size() -1) {
        System.out.print(primes.get(i) + "\n");
        break;
      }
      System.out.print(primes.get(i) + ",");
    }

    return primes;
  }
}
