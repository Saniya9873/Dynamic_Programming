
import java.util.*;

class removingDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = usingtab(n);
        System.out.println(ans);
    }

    static int usingtab(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            int max_digit = 0;
            int temp = i;
            while (temp > 0) {
                int digit = temp % 10;
                max_digit = Math.max(max_digit, digit);
                temp /= 10;
            }
            if (i - max_digit >= 0) {
                dp[i] = 1 + dp[i - max_digit];
            }
        }
        return dp[n];
    }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int[] dp = new int[n + 1];
    //     Arrays.fill(dp, -1);
    //     int ans = usingmemo(n, dp);
    //     System.out.println(ans);
    // }
    // static int usingmemo(int n, int[] dp) {
    //     if (n == 0) {
    //         return 0;
    //     }
    //     if (dp[n] != -1) {
    //         return dp[n];
    //     }
    //     int max_digit = 0;
    //     int temp = n;
    //     while (temp > 0) {
    //         int digit = temp % 10;
    //         max_digit = Math.max(max_digit, digit);
    //         temp /= 10;
    //     }
    //     return dp[n] = 1 + usingmemo(n - max_digit, dp);
    // }
}
