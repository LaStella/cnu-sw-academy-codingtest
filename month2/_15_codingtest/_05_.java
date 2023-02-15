import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toLowerCase();
        int querySize = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        while (querySize-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startIndex = Integer.parseInt(st.nextToken())-1;
            int endIndex = Integer.parseInt(st.nextToken());
            String inputSubString = input.substring(startIndex, endIndex);
            String result = inputSubString.chars().distinct().count() == 26 ? "1" : "0";
            sb.append(result);
        }

        System.out.println(sb);
    }
}
