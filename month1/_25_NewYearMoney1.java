import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] money = new int[n];
        String[] inputArray = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            money[i] = Integer.parseInt(inputArray[i]);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int lessCount = 0;
            int moreCount = 0;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                if (money[i] > money[j]){
                    lessCount++;
                    continue;
                }
                moreCount++;
            }
            sb.append(lessCount + " " + moreCount + "\n");
        }
        System.out.println(sb);
    }
}