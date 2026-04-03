
import java.util.*;

class coinCombination2 {

    static final int MOD = 1000000007;

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
        for (int i = 0; i < l; i++) {
            for (int j = 1; j <= x; j++) {
                if (j - coins[i] >= 0) {
                    dp[j] = (dp[j] + dp[j - coins[i]]) % MOD;
                }
            }
        }
        return dp[x];
    }
}
