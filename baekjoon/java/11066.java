import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[][] dp = new int[n + 1][n + 1];
            int[] sum = new int[n + 1];

            for (int i = 1; i < dp.length; i++) {
                sum[i] = sum[i - 1] + scanner.nextInt();
            }

            for (int i = 1; i < dp.length; i++) {
                for (int j = 1; j < dp.length - i; j++) {
                    dp[j][i + j] = 987654321;
                    for(int k = j; k < i + j; k++) {
                        dp[j][i + j] = min(dp[j][i + j], dp[j][k] + dp[k + 1][i + j] + sum[i + j] - sum[j - 1]);
                    }
                }
            }
            System.out.println(dp[1][n]);
        }
    }

    private static int min(int a, int b) {
        if (a < b)
            return a;
        return b;
    }
}