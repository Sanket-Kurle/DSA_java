import java.util.Scanner;

public class gcd_lcm{
  public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int n1=scn.nextInt();
    int n2=scn.nextInt();
    // int Divisor=n1;
    // int Divident=n2;
    // int temp=0;
    // while(Divisor!=0){
    //   temp=Divisor;
    //   Divisor=Divident%Divisor;
    //   Divident=temp;

    // }
    // int gcd=Divident;
    // int lcm=(n1*n2)/gcd;
    // System.out.println(Divident);
    // System.out.println(lcm);

    // ANOTHER APPROACH 
    int on1=n1;
    int on2=n2;
    while(n1%n2!=0){
      int rem=n1%n2;
      n1=n2;
      n2=rem;
    }
    int gcd =n2;
    int lcm=(on1*on2)/gcd;
    System.out.println(gcd);
    System.out.println(lcm);
  }
}


// GCD and LCM

// Question Statement: 
// 1. You are required to print the Greatest Common Divisor (GCD) of two numbers. 
// 2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers. 
// 3. Take input "num1" and "num2" as the two numbers. 
// 4. Print their GCD and LCM.