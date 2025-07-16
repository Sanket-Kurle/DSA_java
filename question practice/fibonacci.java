import java.util.*;

public class fibonacci {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int n1 = 0;
    int n2 = 1;
    int n3 = 0;
    // if (n == 1) {
    // System.out.println("0");
    // } else if (n == 2) {
    // System.out.println("0\n1");

    // }
    // else {
    // System.out.println("0\n1");
    // for (int i = 3; i <= n; i++) {

    // n3 = n2 + n1;
    // System.out.println(n3);
    // n1 = n2;
    // n2 = n3;

    // }
    // }
    // ABOVE CODE IS CORRECT BUT WE HAVE OPTIMAL FOR IT
    for (int i = 1; i <= n; i++) {
      System.out.println(n1);
      n3 = n2 + n1;
      n1 = n2;
      n2 = n3;
    }
  }

}


// Print all Fibonacci Numbers till N

// Question Statement: 
// 1. You've to print first n fibonacci numbers.
// 2. Take as input "n", the count of fibonacci numbers to print.
// 3. Print first n fibonacci numbers.