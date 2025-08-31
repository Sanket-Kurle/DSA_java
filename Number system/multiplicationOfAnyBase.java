import java.util.Scanner;

public class multiplicationOfAnyBase {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int b = scn.nextInt();
        int ans = product(n1, n2, b);
        System.out.println(ans);

    }
    public static int product(int n1, int n2, int b){
        int sol=0;
        int p=1;
        while(n2>0){
        int d2=n2%10;
        n2=n2/10;
        int sprd=multiplyWithSingleDigit(n1, d2, b);
        sol=Add(sol,sprd*p,b);
        p*=10;
        }
        return sol;
    }

    public static int multiplyWithSingleDigit(int n1, int digit, int b) {
        int sol = 0;
        int p = 1;
        int c = 0;
        while (n1 > 0 || c > 0) {
            int d1 = n1 % 10;
            n1 /= 10;
            int d = d1 * digit + c;
            c = d / b;
            d = d % b;
            sol += d * p;
            p *= 10;
        }
        return sol;
    }

    public static int Add(int n1, int n2, int base) {
        int sol = 0;
        int c = 0;
        int p = 1;

        while (n1 > 0 || n2 > 0 || c > 0) {
            int r1 = n1 % 10;
            int r2 = n2 % 10;
            n1 /= 10;
            n2 /= 10;

            int d = r1 + r2 + c;
            c = d / base;
            d = d % base;

            sol += d * p;
            p *= 10;
        }
        return sol;
    }
}
