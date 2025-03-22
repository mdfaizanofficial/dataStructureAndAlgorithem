package Questions;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        int n = nc.nextInt();
        int len = 0, t1 = n;

        while (t1 != 0) {
            len = len + 1;
            t1 = t1 / 10;
        }

        int rem, t2 = n;
        int arm = 0;
        while (t2 != 0) {
            int mul = 1;
            rem = t2 % 10;
            for (int i = 1; i <= len; i++) {
                mul = mul * rem;
            }
            arm = arm + mul;
            t2 = t2 / 10;
        }
        if (arm == n) {
            System.out.println("no. is arms");
        } else {
            System.out.println("not arms ");
        }
    }
}