public class _13_BitManipulation {
  public static void main(String[] args) {
    /*
    Storage of Signed Binary Numbers: [-2 ^(n - 1) + 1] - [2^(n - 1) + 1]
    Storage of Unsigned Binary Numbers: 0 - [2^(n) - 1]
    
    1. Addition
      0 + 0 = 0
      1 + 0 = 1
      1 + 1 = 0 [Carry 1]
    
    2. Subtraction
      0 - 0 = 0
      1 - 0 = 1
      0 - 1 = 1 [Borrow 1]
      1 - 1 = 0

    If there is a overflow then carry or borrow is discarded.

    3. 2's Compliment
      Assuming a number takes 8 bits:-
      5 -> 00000101
      -5 -> 11111010  [1's Compliment]
                  +1
      -5 -> 11111011  [-2's Compliment]

    4. Bitwise AND:
      0 & 0 = 0
      0 & 1 = 0
      1 & 1 = 1
    
    4. Bitwise OR:
      0 | 0 = 0
      0 | 1 = 1
      1 | 1 = 1

    4. Bitwise XOR:
      0 ^ 0 = 0
      0 ^ 1 = 1
      1 ^ 1 = 0
    
    5. Bitwise NOT:
      ~ 0 = 1
      ~ 1 = 0

    6. Bitwise SHIFT:
      a << b = a x 2^(b)
      a >> b = a ÷ 2^(b)
    */ 

    _13_BitManipulation obj = new _13_BitManipulation();
    obj.two$S$Compliment();
    obj.bitwiseAND();
    obj.bitwiseOR();
    obj.bitwiseXOR();
    obj.one$S$SCompliment();
    obj.shiftOperators();
  }

  public void one$S$SCompliment() {
    byte one$S$ComplimentOfFive = (byte) 0b11111010;
    System.out.println("One's compliment of Five: " + one$S$ComplimentOfFive + " = " + Integer.toBinaryString(one$S$ComplimentOfFive));

    int five = 5;
    System.out.println("Not Five = " + (~five));
  }

  public void two$S$Compliment() {
    byte minusFive = (byte) 0b11111011;
    byte plusFive = 5;
    System.out.println("Minus five: " + minusFive + " = " + Integer.toBinaryString(minusFive));
    byte result = (byte) (plusFive + minusFive);
    System.out.println("Plus Five + Minus Five = " + result);
  }

  public void bitwiseAND() {
    int num1 = 1;
    int num2 = 2;
    System.out.println("Bitwise AND: 1 & 2 = " + (num1 & num2));
  }

  public void bitwiseOR() {
    int num1 = 1;
    int num2 = 2;
    System.out.println("Bitwise OR: 1 | 2 = " + (num1 | num2));
  }

  public void bitwiseXOR() {
    int num1 = 1;
    int num2 = 5;
    System.out.println("Bitwise XOR: 1 ^ 5 = " + (num1 ^ num2));
  }

  public void shiftOperators() {
    int six = 6;
    System.out.println("6 in binary = " + Integer.toBinaryString(six));
    System.out.println("Left shift of 6 by 1 = " + Integer.toBinaryString(six<<1));
    System.out.println("Right shift of 6 by 1 = " + Integer.toBinaryString(six>>1));

    int minusSix = ~5;
    System.out.println("Right shift of -6 by 1 = " + (minusSix>>1) + " = "  + Integer.toBinaryString(minusSix>>1));
    System.out.println("Right shift of -6 with ZERO fill by 1 = " + (minusSix>>>1) + " = " + Integer.toBinaryString(minusSix>>>1));
  }
}
