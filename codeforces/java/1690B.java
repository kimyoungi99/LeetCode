import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];
            int gap = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
                if(gap < a[i] - b[i])
                    gap = a[i] - b[i];
            }

            String ans = "YES";
            for (int i = 0; i < n; i++) {
                if(b[i] != 0 && a[i] - b[i] != gap)
                    ans = "NO";
            }
            System.out.println(ans);
        }
    }
}
