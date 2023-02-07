import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int querySize = Integer.parseInt(st.nextToken());
        int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
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