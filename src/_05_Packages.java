import  java.lang.*;
import java.util.Scanner;


public class _05_Packages {
  public static void main(String[] args) {
    
    try (Scanner scanner = new Scanner(System.in)) {
      // Fully Qualified Name
      java.util.Date javaDate = new java.util.Date();
      java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());

      System.out.println("JavaDate: " + javaDate);
      System.out.println("SQLDate: " + sqlDate);
    }
  }
}
