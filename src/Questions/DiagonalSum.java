package src.Questions;

public class DiagonalSum {

    public static void main(String[] args) {
        int mat[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        int ans = solve(mat);
        System.out.println("Ans is : " + ans);
    }

    private static int solve(int[][] mat) {
        int n = mat.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {

            ans += mat[i][i];

            if (i != (n - 1) - i)
                ans += mat[i][(n - 1) - i];

        }
        return ans;
    }
}
