/**
 * C2 = 1 (О1 = "-")
 * C3 = 0 (С = 0)
 * C5 = 1 (О2 = "/")
 * C7 = 3 (i and j type is "long")
 */
public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int n = 20;
        int m = 20;
        int C = 0;
        float S = 0;
        for (int i = a; i <= n; i++) {
            for (int j = b; j <= m; j++) {
                S = S + ((float)i / j) / (i - C);
            }
        }
        System.out.println(S);
    }
}
