import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        input.close();

        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <=i; j++){
                if((i+j) % 2 != 0){
                    System.out.print(0+" ");
                }else{
                    System.out.print(1+" ");
                }
            }
            System.out.println();   
        }
    }
}
