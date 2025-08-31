import java.util.Scanner;

public class subOfAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int b = scn.nextInt();
        int ans = sub(n1, n2, b);
        System.out.println(ans);

    }

    public static int sub(int n1, int n2, int b) {
        int sol = 0;
        int c = 0;
        int p = 1;
        if (n1 > n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
        while (n2 > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 /= 10;
            n2 /= 10;
            int d = 0;
            d2 = d2 + c;
            if (d2 >= d1) {
                c = 0;
                d = d2 - d1;

            } else {
                c = -1;
                d = d2 + b - d1;

            }
            sol += d * p;
            p *= 10;

        }
        return sol;
    }
}
