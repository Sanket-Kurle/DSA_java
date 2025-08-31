import java.util.Scanner;

public class sumOfAnySameBase {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int b=scn.nextInt();
        int ans=Add(n1, n2, b);
        System.out.println(ans);

    }
    public static int Add(int n1, int n2,int base){
        int sol=0;
        int c=0;
        int p=1;

        while(n1>0||n2>0||c>0){
            int r1=n1%10;
            int r2=n2%10;
            n1/=10;
            n2/=10;
           
            int d=r1+r2+c;
            c=d/base;
            d=d%base;

            sol+=d*p;
            p*=10;
        }
        return sol;
    }
}
