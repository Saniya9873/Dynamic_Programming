
import java.util.*;

public class diceCombinations {

    static final int MOD = 1000000007;

    // public static void main(String[] args) {
    //     int n = 4;
    //     int[] dp = new int[n + 1];
    //     Arrays.fill(dp, -1);
    //     int ans = usingmemo(n, dp);
    //     System.out.println(ans);
    // }
    // static int usingmemo(int n, int[] dp) {
    //     if (n == 0) {
    //         return 1;
    //     }
    //     if (dp[n] != -1) {
    //         return dp[n];
    //     }
    //     int count = 0;
    //     for (int i = 1; i <= 6; i++) {
    //         if (n - i >= 0) {
    //             count += usingmemo(n - i, dp);
    //         }
    //     }
    //     return count;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = usingtab(n);
        System.out.println(ans);
    }

    static int usingtab(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i - j >= 0) {
                    dp[i] = (dp[i] + dp[i - j]) % MOD;
                }
            }
        }
        return dp[n];
    }
}
