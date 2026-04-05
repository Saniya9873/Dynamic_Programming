
import java.util.*;

class frog1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }
        // int[] arr = {10, 10};
        int n = arr.length;

        int ans = tab(arr);
        System.out.println(ans);
        // int[] dp = new int[n + 1];
        // Arrays.fill(dp, -1);
        // int ans = func(0, arr, dp);
        // System.out.println(ans);
    }

    // static int func(int i, int[] arr, int[] dp) {
    //     int n = arr.length;
    //     if (i == n - 1) {
    //         return 0;
    //     }
    //     if (dp[n] != -1) {
    //         return dp[n];
    //     }
    //     int jump1 = Math.abs(arr[i] - arr[i + 1]) + func(i + 1, arr, dp);
    //     int jump2 = Integer.MAX_VALUE;
    //     if (i + 2 < n) {
    //         jump2 = Math.abs(arr[i] - arr[i + 2]) + func(i + 2, arr, dp);
    //     }
    //     return dp[n] = Math.min(jump1, jump2);
    // }
    static int tab(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = Math.abs(arr[0] - arr[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.min(Math.abs(arr[i] - arr[i - 1]) + dp[i - 1], Math.abs(arr[i] - arr[i - 2]) + dp[i - 2]);
        }
        return dp[n - 1];
    }
}
