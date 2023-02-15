// [중] 균형 잡힌 시소

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SolutionTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.parallelPrefix(array, Integer::sum);

        if (size == 1) {
            System.out.println(1);
            return;
        }

        int result = -1;
        for (int i = 1; i < size; i++) {
            int leftWeight = array[i-1];
            int rightWeight = array[size-1] - array[i];
            if (leftWeight == rightWeight) {
                result = i+1;
                break;
            }
        }

        System.out.println(result);
    }
}
