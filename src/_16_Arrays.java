import java.util.Scanner;

public class _16_Arrays {
  public static void main(String[] args) {
    /*
      Data Structure
        1. Primitive -> Variables
        2. Non Primitive ->
          i. Linear ->
            (a) Static -> Array
            (b) Dynamic -> Linked List, Stack, Queue
          ii. Non Linear -> Graph, Tree, Hashmap
    */
    
    /*
      Array
        1. Linear
        2. Contiguous Memory Location
        3. Homogenous [Same type of data]
        4. Static

      Multidimensional Array
      
      ArrayList -> Dynamic Array 

      Heterogenous Array ***
    */

    Scanner scanner = new Scanner(System.in);
    
    // new -> memory allocation / object creation
    int[] arr = new int[5];
    arr[0] = 89;
    arr[1] = 204;
    arr[2] = 13;
    
    
    _16_Arrays obj = new _16_Arrays();
    
    obj.inputArray(arr, scanner);
    obj.insert(arr, 2, 89);
    obj.delete(arr, 1);
    obj.printArray(arr);

    int[][] multiDimArray = new int[2][3];
    multiDimArray = new int[][]{{1, 2, 3}, {4, 5, 6}};
    
    obj.insert2dArray(multiDimArray, 1, 2, 89);
    obj.delete2dArray(multiDimArray, 0, 2);
    obj.print2dArray(multiDimArray);

    int [][] jackedArray = new int[2][];

    try {
      for (int i = 0; i < jackedArray.length; i++) {
      jackedArray[i] = new int[i + 2];
      for (int j = 0; j < jackedArray[i].length; j++) {
        System.out.print("Enter the (" + i + "," + j + ") element: ");
        jackedArray[i][j] = scanner.nextInt();
      }
    }
    } catch (Exception e) {
      System.out.println("For jackedArray");
      e.printStackTrace();
    }

    obj.print2dArray(jackedArray);

    scanner.close();
  }

  public void update(int[] arr, int position, int element) {
    if (position < 0 || position > arr.length - 1) {
      System.out.println("Invalid Position");
      return;
    }

    arr[position] = element;
  }

  public void insert(int[] arr, int position, int element) {
    /*
    Beginning -> O(n)
    Ith Index -> O(n - 1 - i)
    End -> O(1)
    */ 

    if (position < 0 || position > arr.length - 1) {
      System.out.println("Invalid Position");
      return;
    }

    for (int i = arr.length - 2; i >=  position; i--) {
      arr[i + 1] = arr[i];
    }
    arr[position] = element;

  }

  public void delete(int[] arr, int position) {
    if (position < 0 || position > arr.length - 1) {
      System.out.println("Invalid Position");
      return;
    }

    for (int i = position; i <  arr.length - 1; i++) {
      arr[i] = arr[i + 1];
    }
    arr[arr.length - 1] = 0;
  }

  public void inputArray(int[] arr, Scanner scanner) {
    try {
      for (int i = 0; i < arr.length; i++) {
      System.out.print("Enter the " + (i + 1) + "th element: ");
      int input = scanner.nextInt();
      arr[i] = input;
    }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public void update2dArray(int[][] arr, int position1, int position2, int element) {
    if (position1 < 0 || position1 > arr.length - 1 || position2 < 0 || position2 > arr[position1].length -1) {
      System.out.println("Invalid Position");
      return;
    }

    update(arr[position1], position2, element);
  }
  public void insert2dArray(int[][] arr, int position1, int position2, int element) {
    if (position1 < 0 || position1 > arr.length - 1 || position2 < 0 || position2 > arr[position1].length -1) {
      System.out.println("Invalid Position");
      return;
    }

    insert(arr[position1], position2, element);
  }

  public void delete2dArray(int[][] arr, int position1, int position2) {
    if (position1 < 0 || position1 > arr.length - 1 || position2 < 0 || position2 > arr[position1].length -1) {
      System.out.println("Invalid Position");
      return;
    }
    for (int i = arr.length - 1; i >= 0; i -- ) {
      
    }
    delete(arr[position1], position2);
  }
  public void print2dArray(int[][] arr) {
    System.out.println(arr.length + "d Array:");
    for (int i = 0; i < arr.length; i++) {
      // for (int j = 0; j < arr[i].length; j++) {
      //   System.out.print(arr[i][j] +  " ");
      // }
      // System.out.println();
      printArray(arr[i]);
    }
  }
}
