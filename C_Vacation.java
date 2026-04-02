
import java.util.*;

public class C_Vacation {

    static int[][] arr;
    static int[][] dp;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][3];
        dp = new int[n][4];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
        }
        dp[0][0] = arr[0][0];
        dp[0][1] = arr[0][1];
        dp[0][2] = arr[0][2];

        for (int i = 1; i < n; i++) {
            dp[i][0] = arr[i][0] + Math.max(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] = arr[i][1] + Math.max(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] = arr[i][2] + Math.max(dp[i - 1][0], dp[i - 1][1]);
        }
        int ans = Math.max(dp[n - 1][0], Math.max(dp[n - 1][1], dp[n - 1][2]));
        System.out.println(ans);
    }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     n = sc.nextInt();
    //     arr = new int[n][3];
    //     dp = new int[n][4];
    //     for (int i = 0; i < n; i++) {
    //         Arrays.fill(dp[i], -1);
    //     }
    //     for (int i = 0; i < n; i++) {
    //         arr[i][0] = sc.nextInt();
    //         arr[i][1] = sc.nextInt();
    //         arr[i][2] = sc.nextInt();
    //     }
    //     System.out.println(helper(0, 3));
    // }
    // public static int helper(int i, int t) {
    //     if (i == n) {
    //         return 0;
    //     }
    //     if (dp[i][t] != -1) {
    //         return dp[i][t];
    //     }
    //     int res = 0;
    //     for (int j = 0; j < 3; j++) {
    //         if (j != t) {
    //             res = Math.max(res, arr[i][j] + helper(i + 1, j));
    //         }
    //     }
    //     return dp[i][t] = res;
    // }
}
