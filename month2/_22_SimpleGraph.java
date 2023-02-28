import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

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

        for (int i = 1; i <= vertexSize; i++) {
            // 자기 자신을 잇는 간선을 확인합니다.
            if (adjList.get(i).contains(i)) {
                System.out.println("NO");
                return;
            }

            // 두 정점을 잇는 간선이 하나인지 확인합니다.
            boolean[] visited = new boolean[vertexSize+1];
            for (var vertex : adjList.get(i)) {
                if (visited[vertex]) {
                    System.out.println("NO");
                    return;
                }
                visited[vertex] = true;
            }
        }

        System.out.println("YES");
    }
}