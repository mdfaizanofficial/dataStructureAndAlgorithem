import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = input.nextInt();
        input.close();

        char ch = 'A';
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(ch +" ");
            }
            ch++;
            System.out.println();
        }
    }
}