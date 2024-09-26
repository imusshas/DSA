public class _02_DataTypes {

  // Instance level Variable
  int instanceVariable = 0;

  // Class level Variable
  static int staticVariable = 1;

  public static void main(String[] args) {

    //  Illegal modifier for parameter localStaticVariable; only final is permitted
    // static int localStaticVariable = 28;  // _02_DataTypes.java:11: error: illegal start of expression
    
    int literal = 25; // 25 -> Literals

    /*
    Integral Literals:
      byte = 1 byte = -128 to 127
      short = 2 bytes = -32,768 to 32,767
      int = 4 bytes
      long = 8 bytes
    
    Floating-point Literals:
      float = 4 bytes = 7 to 8 decimal digits
      double = 8 bytes = 15 decimal digits

    Character Literals:
      char = 2 bytes

    String Literals:
      escape sequence

    Boolean Literals:
      boolean = 1 byte
    */

    // String Literals
    System.out.println("S\ray\nLiterals: \\\'\"");

    /*
    Type Conversions:
      1. Widening or Automatic (Compatible)
      2. Narrowing or Explicit (Incompatible)
    */ 

    // Constant
    final int constant; // Declaration
    constant = 89;  // Initialization
    // constant = 204;  // _02_DataTypes.java:38: error: variable regNo might already have been assigned

    // System.out.println(instanceVariable);  // _02_DataTypes.java:47: error: non-static variable instanceVariable cannot be referenced from a static context
    System.out.println(staticVariable);
    System.out.println(literal);
    System.out.println(constant);

    _02_DataTypes dataTypes = new _02_DataTypes();
    dataTypes.instanceFunction("Class 1: ");


    _02_DataTypes dataTypes2 = new _02_DataTypes();
    dataTypes2.instanceFunction("Class 2: ");

    dataTypes.instanceVariable = 100;
    // dataTypes.staticVariable = 100;  // Warning: The static field _02_DataTypes.staticVariable should be accessed in a static way
    _02_DataTypes.staticVariable = 100;

    dataTypes.instanceFunction("After change -> Class 1:");
    dataTypes2.instanceFunction("After change -> Class 2:");
  }

  void instanceFunction(String varName) {
    System.out.println(varName);
    System.out.println(instanceVariable);
    System.out.println(staticVariable);
  }
}
