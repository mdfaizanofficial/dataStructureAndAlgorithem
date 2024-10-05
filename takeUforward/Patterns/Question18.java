public class Question18 {
    public static void main(String[] args) {
        int n = 5;

        char ch = 'E';
        for (int i = 0; i < n; i++) {
            char temp = ch;
            for (int j = 0; j <= i; j++) {
                System.out.print(temp);
                temp++;
            }

            ch--;
            System.out.println();

        }
    }
}
