import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Arrays.stream(br.readLine().split(""))
                .map(String::trim)
                .map(String::toLowerCase)
                .distinct()
                .collect(Collectors.joining())
                .length();
        System.out.println(count == 26 ? "YES" : "NO");
    }
}