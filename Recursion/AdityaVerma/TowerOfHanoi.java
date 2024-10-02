package Recursion.AdityaVerma;

public class TowerOfHanoi {
    static int count = 0;

    static void tower(int n, int s, int d, int h) {
        if (n == 1) {
            System.err.println(n + "st Plate Transfer " + s + " -> " + d + " Pillar");
            count++;
            return;
        }
        count++;
        tower(n - 1, s, h, d);
        System.out.println(n + "st Plate Transfer " + s + " -> " + d + " Pillar");
        tower(n - 1, h, d, s);
    }

    public static void main(String[] args) {
        System.out.println("main");
        int s = 1;
        int h = 2;
        int d = 3;
        int n = 3;
        tower(n, s, d, h);
        System.out.println("Total Step: " + count);
    }
}
