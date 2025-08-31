import java.util.Scanner;

public class AnyToAny {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("number:");
        int n = scn.nextInt();
        System.out.println("Current Base:");

        int cb = scn.nextInt();
        System.out.println("To Base:");
        int tb = scn.nextInt();
        int sol = NumConverter(n, cb, tb);
        System.out.println(sol);

    }

    public static int NumConverter(int number, int current_base, int to_base) {
        int sol = 0;
        int power = 1;
        int f_sol = 0;
        int f_power = 1;
        while (number > 0) {
            int rem = number % 10;
            sol += rem * power;
            power *= current_base;
            number /= 10;

        }
        while (sol > 0) {
            int rem = sol % to_base;
            f_sol += rem * f_power;
            f_power *= 10;
            sol /= to_base;

        }
        return f_sol;
    }
}
