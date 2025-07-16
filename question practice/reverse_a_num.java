import java.util.Scanner;

public class reverse_a_num {
static public void main(String[] args){
  Scanner scn=new Scanner(System.in);
  int num=scn.nextInt();
  int temp=num;
  while(temp>0){
    int dig=temp%10;
    temp=temp/10;
    System.out.println(dig);
  }

}
}

// Reverse a number

// Question Statement: 
// 1. You've to display the digits of a number in reverse.
// 2. Take as input "n", the number for which digits have to be display in reverse.
// 3. Print the digits of the number line-wise, but in reverse order.
