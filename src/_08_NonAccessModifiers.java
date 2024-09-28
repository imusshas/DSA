public class _08_NonAccessModifiers {

  char a = 97;
  static char b = 98;

  private _08_NonAccessModifiers () {
    System.out.println("Constructor Executed");
  }

  static {
    System.out.println("Static Executed");
  }

  static class Inner_08_NonAccessModifiers {
    static void print () {
      // System.out.println("Accessing -> " + a + "Inner_08_NonAccessModifiers");  // error: non-static variable a cannot be referenced from a static context
      System.out.println("Accessing static variable -> \t" + b + "\tfrom Inner_08_NonAccessModifiers");
    }
  }

  public static void main(String[] args) {
    // Non access modifiers: They provide special meaning to JVM
    
    /*
      static -> Single copy
      
      Static Method:
        1. Can directly call other static method only
        2. Can directly access static members only
        3. Cannot refer to "this" or "super"
      
      Static Class
        1. Can be created as nested/Inner class only
        2. Can directly access static members of outer class only
    */ 

    /* 
      final

      Final class -> To prevent inheritance
      Final method -> To prevent method overloading
      Final variable -> constant
    */

    /*
    
    */

    System.out.println("Main Executed");
    // System.out.println(a); // error: non-static variable a cannot be referenced from a static context

    Inner_08_NonAccessModifiers.print();
  }
}
