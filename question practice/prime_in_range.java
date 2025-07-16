import java.util.Scanner;

public class prime_in_range {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("give start of range:");
    int n1 = scn.nextInt();
    System.out.println("give end of range:");
    int n2 = scn.nextInt();
    System.out.println("following are prime numbers from " + n1 + " to " + n2);
    for (int i = n1; i <= n2; i++) {
      if (i <= 1)
        continue;
      int count = 0;
      for (int j = 2; j * j <= i; j++) {
        if (i % j == 0) {
          count++;
          break;
        }
      }
      if (count == 0) {
        System.out.println(i + " Is prime ");
      }
    }

  }
}


// Question Statement: 
// 1. You've to print all prime numbers between a range. 
// 2. Take as input "low", the lower limit of range.
// 3. Take as input "high", the higher limit of range.
// 4. For the range print all the primes numbers between low and high (both included).