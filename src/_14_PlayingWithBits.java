public class _14_PlayingWithBits {
  public static void main(String[] args) {
    /*
      (n & (n - 1)) unset the right most set bit.
    */ 
    _14_PlayingWithBits obj = new _14_PlayingWithBits();
    obj.isEven(6, true);
    obj.isEven(5, true);
    obj.findTheIthBit(100, 6);
    obj.findTheIthBit(256, 6);
    obj.findTheIthBitMethod2(89, 6);
    obj.printBits(35);
    System.out.println();
    obj.setIthBit(35, 4);
    obj.toggleIthBit(51, 4);
    obj.unsetIthBit(35, 4);
    obj.unsetIthBit(63, 4);
    obj.isPowerOfTwo(16);
    obj.isPowerOfTwo(6);
    obj.unsetTheRightMostSetBit(48);
    obj.numberOfSetBits(48);
  }

  public boolean isEven(int num, boolean print) {
    if ((num & 1) != 0) {
      if (print) {
        System.out.println(num + " is Odd");
      }
      return false;
    } else {
      if (print) {
        System.out.println(num + " is Even");
      }
      return true;
    }
  }

  public int findTheIthBit(int num, int position) {
    int res = (num >> position);
    if (isEven(res, false)) {
      System.out.println(position + "th bit of " + Integer.toBinaryString(num) + " is: " + 0);
      return 0;
    } else {
      System.out.println(position + "th bit of " + Integer.toBinaryString(num) + " is: " + 1);
      return 1;
    }
  }

  public int findTheIthBitMethod2(int num, int position) {
    int res = (1 << position);
    if ((res & num) != 0) {
      System.out.println(position + "th bit of " + Integer.toBinaryString(num) + " is: " + 1);
      return 1;
    } else {
      System.out.println(position + "th bit of " + Integer.toBinaryString(num) + " is: " + 0);
      return 0;
    }
  }

  public void printBits(int num) {
    if (num == 0) {
      return;
    }

    printBits((num >> 1));
    
    if ((num & 1) != 0) {
      System.out.print(1);
    } else {
      System.out.print(0);
    }
  }

  public int setIthBit(int num, int position) {
    int res = num | (1<<position);
    System.out.println("set " + position + "th Bit: From -> " + Integer.toBinaryString(num) + " to -> " + Integer.toBinaryString(res));
    return res;
  }
  
  public int toggleIthBit(int num, int position) {
    int res = num ^ (1<<position);
    System.out.println("toggle " + position + "th Bit: From -> " + Integer.toBinaryString(num) + " to -> " + Integer.toBinaryString(res));
    return res;
  }

  public int unsetIthBit(int num, int position) {
    int res = num & (~(1<<position));
    System.out.println("unset " + position + "th Bit: From -> " + Integer.toBinaryString(num) + " to -> " + Integer.toBinaryString(res));
    return res;
  }

  public boolean isPowerOfTwo(int num) {
    boolean res = (num & (num -1)) == 0;
    if (res) {
      System.out.println(num + " is power of two");
    } else {
      System.out.println(num + " is not power of two");
    }
    return res;
  }

  public int unsetTheRightMostSetBit(int num) {
    int res = (num & (num -1));
    System.out.println("unsetTheRightMostSetBit: From -> " + Integer.toBinaryString(num) + " to -> " + Integer.toBinaryString(res));
    return res;
  }

  public int numberOfSetBits(int num) {
    int bits = 0;
    int res = num;
    while (res != 0) {
      bits++;
      res = (res & (res - 1));
    }

    System.out.println("Number of set bits in " + num + " is " + bits);

    return bits;
  }
}
