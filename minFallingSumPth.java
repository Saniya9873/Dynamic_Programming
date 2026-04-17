
import java.util.*;

class minFallingSumPth {

    static int rows;
    static int col;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();
        col = sc.nextInt();
        int[][] mat = new int[rows][col];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int j = 0; j < col; j++) {
            ans = Math.min(ans, func(0, j, mat));
        }
        System.out.println(ans);
    }

    static int func(int i, int j, int[][] mat) {
        if (j < 0 || j >= col) {
            return Integer.MAX_VALUE;
        }
        if (i == rows - 1) {
            return mat[i][j];
        }
        int below = func(i + 1, j, mat);
        int downl = func(i + 1, j - 1, mat);
        int dowmr = func(i + 1, j + 1, mat);
        return mat[i][j] + Math.min(below, Math.min(downl, dowmr));
    }
}
