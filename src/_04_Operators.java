public class _04_Operators {
  public static void main(String[] args) {
    /* 
    Unary Operators -> Associativity [Right To Left]
      1.  Postfix: a++, a-- Associativity [Left To Right]
      2.  Prefix: ++a, --a, +a, -a, ~a, !a
    
    Arithmetic Operators -> Associativity [Left To Right]
      1.  Multiplication: a*b, a/b, a%b
      2.  Addition: a+b, a-b
    
    Shift Operators -> Associativity [Left To Right]
      a<<b, a>>b, a>>>b; // [>>> -> Right Shift with Zero{0} Fill]
      
    Relational Operators -> Associativity [Left To Right]
      1. Comparison: a>b, a<b, a>=b, a<=b, a instanceof b;  // [Use Objects for instanceof];
      2. Equality: a == b, a != b

    Bitwise Operators -> Associativity [Left To Right]
      a&b, a|b, a^b
      
    Logical Operators -> Associativity [Left To Right]
      a>b && a<c, a>b || a<c
    
    Ternary Operators -> Associativity [Right To Left]
      a>b ? true : false 

    Assignment Operators -> Associativity [Right To Left]
      a*=b, a/=b, a%=b, a+=b, a-=b, a&=b, a|=b, a^=b, a<<=b, a>>=b, a>>>=b
    */ 

    Integer a = 10;
    Object b = 20;
    // System.out.println(a instanceof b);  // _04_Operators.java:21: error: cannot find symbol
    System.out.println(a instanceof Object);
    System.out.println(b instanceof Integer);
  }
}
