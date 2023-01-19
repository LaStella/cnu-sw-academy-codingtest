import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (testCase-- > 0) {
            int arrayLength = Integer.parseInt(br.readLine());

            String[] array = br.readLine().split(" ");
            for (int i = 1; i < arrayLength - 1; i++) {
                boolean prevEqualsNext = array[i - 1].equals(array[i + 1]);
                boolean nowEqualsPrev = array[i].equals(array[i-1]);
                boolean nowEqualsNext = array[i].equals(array[i+1]);
                // 현재 숫자가 앞, 뒤 숫자와 다른 경우
                if (prevEqualsNext && !nowEqualsNext) {
                    sb.append(i + 1 + "\n");
                    break;
                }
                // 현재 숫자와 앞 숫자는 같으나 뒤 숫자가 다른 경우
                if (nowEqualsPrev && !nowEqualsNext) {
                    sb.append(i + 2 + "\n");
                    break;
                }
                // 현재 숫자와 뒤 숫자는 같으나 앞 숫자가 다른 경우
                if (nowEqualsNext && !nowEqualsPrev) {
                    sb.append(i + "\n");
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
