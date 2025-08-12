import java.util.Scanner;


public class function1_fact{

  public static int fact(int x){
  int rv=1;
  for(int i=1;i<=x;i++){
    rv*=i;

  }
  return rv;
}
public static int npr(int nf,int nmrf){
  int nPr=nf/nmrf;
  return nPr;
}
 public static void main(String[] args){
  Scanner scn=new Scanner(System.in);
  int n=scn.nextInt();
  int r=scn.nextInt();

  int nf=fact(n);
  int nmrf=fact(n-r);
  System.out.println(npr(nf, nmrf));



 }
}