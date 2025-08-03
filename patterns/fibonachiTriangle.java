import java.util.Scanner;

public class fibonachiTriangle {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int p1 = 0;
    int p2 = 1;
    int p3 = 0;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(p1 + "\t");
        p3 = p1+p2;
        p1 =p2; 
        p2=p3;

      }
      System.out.println();
    }
  }
}
