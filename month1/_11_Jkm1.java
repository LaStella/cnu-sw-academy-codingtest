import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11_Jkm1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int kPrice = 0;
            int sellDay = 0;
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                int price = Integer.parseInt(st.nextToken());
                if (i == k) kPrice = price;
                if (kPrice != 0 && kPrice + m <= price) {
                    sellDay = i;
                    break;
                }
            }

            if (sellDay != 0) {
                sb.append(sellDay+"\n");
                continue;
            }
            sb.append("JB\n");
        }
        System.out.println(sb);
    }
}