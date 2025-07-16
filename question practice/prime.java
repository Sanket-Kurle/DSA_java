import java.util.*;

public class prime {

  public static void main(String[] args) {
    // Scanner scn = new Scanner(System.in);
    // int t = scn.nextInt();
    // int count=0;
    // for(int i = 1;i<=t;i++){
    // if(t%i==0){
    // count+=1;
    // }
    // }
    // if(count==2){
    // System.out.println("is prime");
    // }else{
    // System.out.println("is not prime");

    // }
    // THE ABOVE CODE GIVES ANS BUT IS NOT OPTIMAL!!

    // NOW BELOW CODE IS ALSO NOT OPTIMAL BUT IS FOR MULTIPLE TEST CASES
    // Scanner scn=new Scanner(System.in);
    // System.out.print("Enter number of test cases: ");
    // int t=scn.nextInt();
    // for(int i=0;i<t;i++){
    // System.out.print("Enter number " + (i + 1) + ": ");
    // int num=scn.nextInt();
    // int count=0;
    // for(int j=1;j<=num;j++){
    // if(num%j==0){
    // count+=1;
    // }
    // }
    // if(count==2){
    // System.out.println("is prime");
    // }else{
    // System.out.println("is not prime");

    // }
    // }
    Scanner scn = new Scanner(System.in);
    int test = scn.nextInt();
    for (int t = 1; t <= test; t++){
    int num = scn.nextInt();
    int count = 0;
    for (int i = 2; i * i <= num; i++){
    if(num%i==0){
      count++;
      break;

    }
  }
    if(count==0){
      System.out.println(num+" is prime");
    }
    else{
      System.out.println(num+" is not prime");
    }
  
    }
  }
}


// Question Statement: 
// 1. You've to check whether a given number is prime or not.
// 2. Take a number "t" as input representing count of input numbers to be tested.
// 3. Take a number "n" as input "t" number of times.
// 4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.