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

        int querySize = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int nowVertex = Integer.parseInt(st.nextToken());
        while (st.hasMoreTokens()) {
            int nextVertex = Integer.parseInt(st.nextToken());
            // 다음으로 연결되는 간선을 확인합니다.
            if (!adjList.get(nowVertex).contains(nextVertex)) {
                System.out.println("NO");
                return;
            }
            nowVertex = nextVertex;
        }

        System.out.println("YES");

    }
}