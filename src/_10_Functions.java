public class _10_Functions {

  private static class _10_Swap {
    private int temp;

    public _10_Swap(int temp) {
      this.temp = temp;
    }

    public int getTemp() {
      return temp;
    }
  }

  public static void main(String[] args) {

    /* 
      A function call ends when ->
        1. It reaches the end of the function
        2. It reaches a return statement
        3. It throws an exception
    */ 

    _10_Functions functions = new _10_Functions();
    functions.calculateArea(10, 20);
    int sum = functions.calculateSum(10, 20);
    System.out.println("Sum = " + sum);
    
    /*************************** Pass by value ***************************/ 
    int num1 = 10;
    int num2 = 20;
    System.out.println("Before swap: num1 = " + num1 + " num2 = " + num2);
    functions.swap(num1, num2);   
    System.out.println("After swap: num1 = " + num1 + " num2 = " + num2);
    /*************************** Pass by value ***************************/ 

    /*************************** Pass by reference ***************************/
    _10_Swap obj1 = new _10_Swap(10);
    _10_Swap obj2 = new _10_Swap(20);
    
    System.out.println("Before swap: obj1 = " + obj1.getTemp() + " obj2 = " + obj2.getTemp());
    functions.swap(obj1, obj2);
    System.out.println("After swap: obj1 = " + obj1.getTemp() + " obj2 =  " + obj2.getTemp());
    /*************************** Pass by reference ***************************/
  }

  public void calculateArea(int length, int width) {
    System.out.println("Area = " + length * width);
  }

  public int calculateSum(int num1, int num2) {
    return num1 + num2;
  }

  // Pass by value
  // Function overloading: Compile time polymorphism
  public void swap(int num1, int num2) {
    int temp = num1;
    num1 = num2;
    num2 = temp;
    System.out.println("Inside swap: num1 = " + num1 + " num2 = " + num2);
    return;
  } 

  // Pass by reference
  // Function overloading: Compile time polymorphism
  public void swap(_10_Swap obj1, _10_Swap obj2) {
    int temp = obj1.temp;
    obj1.temp = obj2.temp;
    obj2.temp = temp;
    System.out.println("Inside swap: obj1 = " + obj1.getTemp() + " obj2 = " + obj2.getTemp());
    return;
  }
}
