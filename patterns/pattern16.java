import java.util.Scanner;

public class pattern16 {
  public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int sp=2*n-3;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.err.print(j+"\t");
      }
      for(int j=1;j<=sp;j++){
        System.err.print("\t");
      }
      for(int j=i;j>=1;j--){
        System.err.print(j+"\t");
      }
      System.out.println();
      sp=sp-2;
    }
  }
}
