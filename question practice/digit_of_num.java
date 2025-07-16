import java.util.Scanner;

public class digit_of_num {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num=scn.nextInt();
    int count=0;
    int c_num=num;
    while (c_num!=0) {
      c_num=c_num/10;
      count++;  
    }
    int div=(int)Math.pow(10, count-1);
    while (div!=0) {
      int q=num/div;
      System.out.println(q);
      num=num%div;
      div=div/10;

    }
  }
}


// Digits of a number

// Question Statement: 
// 1. You've to display the digits of a number.
// 2. Take as input "n", the number for which digits have to be displayed.
// 3. Print the digits of the number line-wise.
