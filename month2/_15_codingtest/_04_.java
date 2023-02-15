// 무슨 노래 듣고있어요 3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SolutionTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        int[] songLength = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.parallelPrefix(songLength, Integer::sum);

        int querySize = Integer.parseInt(br.readLine());
        int total = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int query = Integer.parseInt(st.nextToken());
            int remain = query % (songLength[size - 1]);
            int result = size;
            if (remain != 0) {
                for (int i = 0; i < size; i++) {
                    if (remain <= songLength[i]) {
                        result = i + 1;
                        break;
                    }
                }
            }

            total = (total + result) % 1000000007;

        }

        System.out.println(total);
    }
}
