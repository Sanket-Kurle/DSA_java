import java.util.Scanner;

public class pytha_triplet {
  public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    int n1=scn.nextInt();
    int n2=scn.nextInt();
    int n3=scn.nextInt();
  //   int hyp;
  //   if(n1>n2 && n1>n3){
  //     hyp=n1;
  //     n1=n2;
  //     n2=n3;
  //   }else if(n2>n1 & n2>n3){
  //     hyp=n2;
  //     n2=n3;
  //   }else{
  //     hyp=n3;
  //   }
  //   hyp=hyp*hyp;
  //   if (hyp==(n1*n1+n2*n2)) {
  //     System.out.println("true");
  //   }else{
  //     System.out.println("false");
  //   }
  int max=n1;
    if(n2>max){
      max=n2;
    }
    if(n3>max){
      max=n3;
    }
if(max==n1){
  boolean flag=((n2*n2+n3*n3)==n1*n1);
  System.out.println(flag);
}else if(max==n2){
  boolean flag=((n1*n1+n3*n3)==n2*n2);
  System.out.println(flag);
}else if(max==n3){
    boolean flag=((n2*n2+n1*n1)==n3*n3);
  System.out.println(flag);
} else{
  System.out.println(false);
}

  }
  
}


// Pythagorean Triplets

// Question Link: 
// https://nados.io/question/pythagorean...

// Question Statement: 
// 1. You are required to check if a given set of numbers is a valid pythagorean triplet.
// 2. Take as input three numbers a, b and c.
// 3. Print true if they can form a pythagorean triplet and false otherwise.