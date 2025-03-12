package Recursion.Pattern;

public class Pattern01 {
    public static void main(String[] args) {
        int row = 4;
        int col = 0;
        print(row, col);
    }
    private static void print(int row, int col) {
        if(row <= 0){
            return;
        }

        if(col < row) {
            System.out.print("* ");
            print(row, col+1);
        }else{
            System.out.println();
            print(row-1, 0);
        }
    }
}
