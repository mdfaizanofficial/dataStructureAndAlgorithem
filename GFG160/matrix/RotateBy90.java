package GFG160.matrix;

public class RotateBy90 {

    static void printMatrix(int[][] mat){
        System.out.println("<------------------------------->");
        for(int arr[] : mat) {
            for(int i : arr) {
                System.out.print(i +"\t");
            }
            System.out.println();
        }
    }

    static void solve(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;
        printMatrix(mat);

        for(int i = 0; i < n; i++) {
            for(int j = i; j < m; j++){
                swap(mat, i, j);
            }
        }

        printMatrix(mat);

        for(int i = 0; i < m; i++) {
            int top = 0, bottom = n-1;
            while(top <= bottom) {
                int temp = mat[top][i];
                mat[top][i] = mat[bottom][i];
                mat[bottom][i] = temp;
                top++;
                bottom--;
            }
        }
        printMatrix(mat);
    }
    static void rev(int[][] mat, int i, int j){

    }
    static void swap(int[][] mat, int i, int j) {
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
    }
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        solve(mat);
    }
}
