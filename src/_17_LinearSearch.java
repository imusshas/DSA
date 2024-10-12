import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;

public class _17_LinearSearch {
  public static void main(String[] args) {
    int[] arr = {3, 1, 3, 4, 2, 3, 2, 2};
    _17_LinearSearch obj = new _17_LinearSearch();
    obj.findFirstOccurrence(arr, 2, true);
    obj.findFirstOccurrence(arr, 0, true);
    obj.findAllOccurrences(arr, 2, true);
    obj.findAllOccurrences(arr, 0, true);
    obj.findLastOccurrence(arr, 3, true);

    int[][] array2d = {
      {2, 4, 1, 5, 1},
      {6, 7, 3, 4, 2},
      {8, 1, 2, 2, 3},
      {5, 5, 5, 8, 4},
    };

    obj.findFirstOccurrence2d(array2d, 5);
    obj.findAllOccurrences2d(array2d, 4);
    obj.findLastOccurrence2d(array2d, 5);
    obj.maximumSumSubArray(array2d);
  }

  public int findFirstOccurrence(int[] arr, int element, boolean print) {
    int index = - 1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == element) {
        index = i;
        break;
      }
    }
    if (print) {
      System.out.println("First occurrence of " + element + " is at: " + index);
    }
    return index;
  }

  public int findLastOccurrence(int[] arr, int element, boolean print) {
    int index = - 1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == element) {
        index = i;
      }
    }
    if (print) {
      System.out.println("Last occurrence of " + element + " is at: " + index);
    }
    return index;
  }

  public ArrayList<Integer> findAllOccurrences(int[] arr, int element, boolean print) {
    ArrayList<Integer> indexes = new ArrayList<Integer>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == element) {
        indexes.add(i);
      }
    }
    if (print) {
      System.out.println("All occurrences of: " + element);
      for (Integer index : indexes) {
        System.out.print(index + " ");
      }
    }
    System.out.println();
    return indexes;
  }

  public SimpleEntry<Integer,Integer> findFirstOccurrence2d(int[][] arr, int element) {
    SimpleEntry<Integer,Integer>  index = new SimpleEntry<>(-1, -1);

    for (int i = 0; i < arr.length; i++) {
      int occurrence = findFirstOccurrence(arr[i], element,false);
      if (occurrence != -1) {
        index = new SimpleEntry<>(i, occurrence);
        break;
      }
    }

    System.out.println("First occurrence of " + element + " is at: (" + index.getKey() + "," + index.getValue() + ")");

    return index;
  }

  public ArrayList<ArrayList<Integer>> findAllOccurrences2d(int[][] arr, int element) {
    ArrayList<ArrayList<Integer>> indexes = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      indexes.add(findAllOccurrences(arr[i], element, false));
    }
    
    System.out.println("All occurrences of: " + element);
    for (int i = 0; i < indexes.size(); i++) {
      for (int j = 0; j < indexes.get(i).size(); j++) {
        System.out.print("(" + i + "," + indexes.get(i).get(j) + ") ");
      }      
    }
    System.out.println();
    return indexes;
  }

  public SimpleEntry<Integer,Integer> findLastOccurrence2d(int[][] arr, int element) {
    SimpleEntry<Integer,Integer>  index = new SimpleEntry<>(-1, -1);

    for (int i = 0; i < arr.length; i++) {
      int occurrence = findLastOccurrence(arr[i], element,false);
      if (occurrence != -1) {
        index = new SimpleEntry<>(i, occurrence);
      }
    }

    System.out.println("Last occurrence of " + element + " is at: (" + index.getKey() + "," + index.getValue() + ")");

    return index;
  }

  public int maximumSumSubArray(int[][] arr) {
    int maxSum = Integer.MIN_VALUE;
    int index = -1;
    for (int i = 0; i < arr.length; i++) {
      int sum = 0;
      for (int j = 0; j < arr[i].length; j++) {
        sum += arr[i][j];
      }
      if (sum > maxSum) {
        maxSum = sum;
        index = i;
      }
    }
    System.out.println("Maximum sum is at: " + index + " and the sum = " + maxSum);
    return index;
  }
}
