import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _13_ButFast {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int gcd = getGcd(a, b);
            if (a * b == a * b / gcd) {
                sb.append("Perfect\n");
                continue;
            }
            sb.append("Not even close\n");
        }
        System.out.println(sb);
    }

    public static int getGcd(int a, int b) {
        int r = a % b;
        if (r == 0) {
            return b;
        } else {
            return getGcd(b, r);
        }
    }
}