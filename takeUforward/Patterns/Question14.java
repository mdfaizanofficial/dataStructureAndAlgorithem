import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = input.nextInt();
        input.close();

        for(int i = 1; i <= n; i++){
            char ch = 'A';
            for(int j = 1; j <= i; j++){
                System.out.print(ch +" ");
                ch++;
            }
            System.out.println();
        }
    }
}
