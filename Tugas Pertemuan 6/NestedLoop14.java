public class NestedLoop14 {
  public static void main(String[] args) {
      for (int i = 7; i >= 1; i--) { 
          for (int j = 0; j < i; j++) { 
              System.out.print("*");
          }
          System.out.println(); 
      }
  }
}