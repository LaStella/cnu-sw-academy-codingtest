import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int querySize = Integer.parseInt(br.readLine());

        int[] stack = new int[querySize];
        int pointer = 0;

        StringBuilder sb = new StringBuilder();
        while (querySize-- > 0) {
            String query = br.readLine();
            if (query.equals("pop")) {
                if (pointer == 0) {
                    sb.append(-1 + "\n");
                    continue;
                }
                sb.append(stack[pointer--] + "\n");
                continue;
            }
            int numb = Integer.parseInt(query.split(" ")[1]);
            stack[++pointer] = numb;
        }

        System.out.println(sb);
    }
}