import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = input.nextInt();
        input.close();

        int num = 1;

        for(int i = 1; i <=n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(num++ +" ");
            }
            System.out.println();
        }
    }
}