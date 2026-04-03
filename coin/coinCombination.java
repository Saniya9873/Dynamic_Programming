
import java.util.*;

class coinCombination {

    static final int MOD = 1000000007;

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int x = sc.nextInt();
    //     int[] coins = new int[n];
    //     for (int i = 0; i < n; i++) {
    //         coins[i] = sc.nextInt();
    //     }
    //     int[] dp = new int[x + 1];
    //     Arrays.fill(dp, 0);
    //     int ans = usingmemo(x, coins, dp);
    //     System.out.println(ans);
    // }
    // static int usingmemo(int x, int[] coins, int[] dp) {
    //     int l = coins.length;
    //     if (x == 0) {
    //         return 1;
    //     }
    //     if (dp[x] != 0) {
    //         return dp[x];
    //     }
    //     int res = 0;
    //     for (int i = 0; i < l; i++) {
    //         if (x - coins[i] >= 0) {
    //             res += usingmemo(x - coins[i], coins, dp) % INF;
    //         }
    //     }
    //     return dp[x] = res % INF;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        int ans = usingtab(x, coins);
        System.out.println(ans);
    }

    static int usingtab(int x, int[] coins) {
        int l = coins.length;
        int[] dp = new int[x + 1];
        Arrays.fill(dp, 0);
        dp[0] = 1;
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < l; j++) {
                if (i - coins[j] >= 0) {
                    dp[i] = (dp[i] + dp[i - coins[j]]) % MOD;
                }
            }
        }
        return dp[x];
    }
}
