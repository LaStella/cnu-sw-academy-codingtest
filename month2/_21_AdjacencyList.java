import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int vertexSize = Integer.parseInt(st.nextToken());
        int edgeSize = Integer.parseInt(st.nextToken());
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i <= vertexSize; i++) {
            adjList.add(new ArrayList<>());
        }

        while (edgeSize-- > 0) {
            st = new StringTokenizer(br.readLine());
            int pointU = Integer.parseInt(st.nextToken());
            int pointV = Integer.parseInt(st.nextToken());

            adjList.get(pointU).add(pointV);
            adjList.get(pointV).add(pointU);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1 ; i <= vertexSize ; i++) {
            if (adjList.get(i).isEmpty()) {
                sb.append(-1).append("\n");
                continue;
            }
            String line = adjList.get(i).stream().sorted().map(String::valueOf).collect(Collectors.joining(" "));
            sb.append(line).append("\n");
        }
        System.out.println(sb);
    }
}