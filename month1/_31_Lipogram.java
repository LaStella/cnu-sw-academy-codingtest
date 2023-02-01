import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String check = "abcdefghijklmnopqrstuvwxyz";
        Set<String> set = Arrays.stream(br.readLine().split(""))
                .filter(s -> !s.trim().isEmpty())
                .map(String::toLowerCase)
                .collect(Collectors.toSet());
        if (set.size() == 26) {
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
        StringBuilder sb = new StringBuilder();
        for (String s : check.split("")) {
            if (!set.contains(s)) sb.append(s);
        }
        System.out.println(sb);
    }
}