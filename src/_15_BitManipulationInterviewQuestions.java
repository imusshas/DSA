public class _15_BitManipulationInterviewQuestions {
  public static void main(String[] args) {

    /*
      num ^ num = 0
      num ^ 0 = num
    */ 

    _15_BitManipulationInterviewQuestions obj = new _15_BitManipulationInterviewQuestions();
    obj.clearLSBs(53, 4);
    obj.clearMSBs(53, 4);
    obj.clearMSBsExclusive(53, 4);
    
    obj.convertCase('M');
    obj.convertCase('m');
    obj.toLowerCase('M');
    obj.toUpperCase('m');

    obj.swap(89, 204);

    int[] arr = {1,2,2,1,3};
    obj.uniqueOccurrenceRepeatEvenTimes(arr);
    arr = new int[]{2,2,6,3,1,1,4,3};
    obj.twoUniqueElement(arr);
  }

  public int clearLSBs(int num, int position) {
    int res = (~1 << (position + 1)) & num;
    res = ~((1 << (position + 1)) - 1) & num;
    System.out.println("clearLSBs: From " + Integer.toBinaryString(num) + " to " + Integer.toBinaryString(res));
    return res;
  }

  public int clearMSBs(int num, int position) {
    int res = num & ((1 << position) - 1);
    System.out.println("clearMSBs: From " + Integer.toBinaryString(num) + " to " + Integer.toBinaryString(res));
    return res;
  }

  public int clearMSBsExclusive(int num, int position) {
    int res = num & ((1 << (position + 1)) - 1);
    System.out.println("clearMSBsExclusive: From " + Integer.toBinaryString(num) + " to " + Integer.toBinaryString(res));
    return res;
  }

  public char convertCase(char ch) {
    /*
      A -> 1000001
      B -> 1000010
      -------------
      a -> 1100001
      b -> 1100010
    */ 
    char convert = (char) ((int) (ch) ^ (1<<5));
    convert = (char) (ch ^ ' ');
    System.out.println("convertCase: From  -> " + ch + " - to -> " + convert);
    return convert;
  }
  
  public char toUpperCase(char ch) {
    char convert = (char) ((int) (ch) & ~(1<<5));
    convert = (char) (ch & '_');
    System.out.println("toUpperCase: From  -> " + ch + " - to -> " + convert);
    return convert;
  }

  public char toLowerCase(char ch) {
    char convert = (char) ((int) (ch) | (1<<5));
    convert = (char) (ch | ' ');
    System.out.println("toLowerCase: From  -> " + ch + " - to -> " + convert);
    return convert;
  }

  public void swap(int num1, int num2) {
    System.out.println("before swap: num1 = " + num1 + " num2 = " + num2);
    num1 ^= num2; // num1 = num1 ^ num2 [1]
    num2 ^= num1; // num2 = num1 ^ num2 -> (num1 ^ num2) [1] ^ num2 -> num1 ^ (num2 ^ num2) -> num1 ^ 0 = num1
    num1 ^= num2; // num1 = num1 ^ num2 -> (num1 ^ num2) [1] ^ num1 -> (num1 ^ num1) ^ num2 -> 0 ^ num2 = num2
    System.out.println("after swap: num1 = " + num1 + " num2 = " + num2);
  }

  public int uniqueOccurrenceRepeatEvenTimes(int[] arr) {
    int res = 0;
    for (int num: arr) {
      res ^= num;
    }
    System.out.println("uniqueOccurrenceRepeatEvenTimes: " + res);
    return res;
  }

  public void twoUniqueElement(int[] arr) {
    int res = 0;
    for (int num : arr) {
      res ^= num;
    }

    int setBit = 0;
    while (((res >> setBit) & 1) == 0) {
      setBit++;
    }

    int ans = res;
    for (int num : arr) {
      if (((num >> setBit) & 1) != 0 ) {
        ans ^= num;
      }
    }

    System.out.print("One unique number is: " + ans);
    System.out.println(" and another unique number is: " + (ans ^ res));

  }
}