import java.util.Scanner;

public class Question12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Entr the value of n: ");
        int n = input.nextInt();
        input.close();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            for(int j = n-1; j >= i; j--){
                System.out.print("  ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
