import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int querySize = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>(IntStream.rangeClosed(1, size).boxed().collect(Collectors.toList()));

        while (querySize-- > 0) {
            String query = br.readLine();
            // 돌이 하나밖에 안남은 경우 아무 행동도 하지 않습니다.
            if (queue.size() == 1) continue;
            int polledStone = queue.poll();
            // 돌을 위로 올리는 경우에만 뺀 돌을 큐에 다시 넣습니다.
            if (query.equals("raise")) {
                queue.add(polledStone);
            }
        }

        System.out.println(queue.peek());
    }
}