import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] sushi = Arrays.stream(br.readLine().split(" ")).mapToInt(s -> Math.abs(Integer.parseInt(s)-320)).toArray();
        int minIndex = IntStream.range(0, size).reduce((i, j) -> sushi[i] <= sushi[j] ? i : j).getAsInt();

        System.out.println(minIndex+1);
    }
}