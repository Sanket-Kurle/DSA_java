import java.util.Scanner;

public class decimalToAny {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int base = scn.nextInt();
    long sol =getConvertNum(n, base);  
    System.out.println(sol);
  }

  public static long getConvertNum(int x,int y){
    long ans=0;
    long p = 1;
    while (x != 0) {
      long dig = x%y;
      ans += dig * p;
      x = x /y;
      p=p*10;
    }
    return ans;
  }

}
