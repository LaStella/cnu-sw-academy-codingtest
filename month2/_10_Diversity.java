import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int querySize = Integer.parseInt(st.nextToken());
        // 주어진 문자열을 e는 1로, 그 외의 문자는 0으로 변환하여 배열에 저장합니다.
        int[] array = Arrays.stream(br.readLine().split("")).mapToInt(s -> {
            if (s.equals("e")) return 1;
            return 0;
        }).toArray();
        // 배열의 누적합을 저장합니다.
        // array[i] : 0부터 i번째 문자까지 e가 나온 개수
        Arrays.parallelPrefix(array, Integer::sum);

        StringBuilder sb = new StringBuilder();
        while (querySize-- > 0) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken())-1;
            int end = Integer.parseInt(st.nextToken())-1;
            if (start == 0) {
                sb.append(array[end]+"\n");
                continue;
            }
            sb.append(array[end]-array[start-1]+"\n");
        }
        
        System.out.println(sb);
    }
}