import java.util.Scanner;

public class hallowDiamond {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int str = n / 2 + 1;
    int sp = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= str; j++) {
        System.out.print("*\t");

      }
      for (int j = 1; j <= sp; j++) {
        System.out.print("\t");
      }
      for (int j = 1; j <= str; j++) {
        System.out.print("*\t");

      }
      if (i <= n / 2) {
        str = str - 1;
        sp = sp + 2;
      } else {
        str = str + 1;
        sp = sp -2;
      }
      System.out.println();

    }

  }
}
