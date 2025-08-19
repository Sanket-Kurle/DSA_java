import java.util.Scanner;

public class AnyBaseToDecimal {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int cBase = scn.nextInt();
    long sol = getConvertToDecimal(n, cBase);
    System.out.println(sol);

  }

  public static long getConvertToDecimal(int num, int base) {
    long ans = 0;
    long p=1;
    while(num!=0){
      long dig=num%10;
      ans+=dig*p;
      num=num/10;
      p=p*base;

    }
    return ans;
  }
}
