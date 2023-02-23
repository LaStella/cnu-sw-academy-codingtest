import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int querySize = Integer.parseInt(st.nextToken());
        int[][] adj = new int[size][size];


        while (querySize-- > 0) {
            st = new StringTokenizer(br.readLine());
            int pointU = Integer.parseInt(st.nextToken()) - 1;
            int pointV = Integer.parseInt(st.nextToken()) - 1;

            adj[pointU][pointV] = 1;
            adj[pointV][pointU] = 1;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sb.append(adj[i][j] + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}