import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String input = br.readLine();
        Map<Character, Long> map = input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        int result = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            char now = input.charAt(i);
            set.add(now);
            if (map.compute(now, (k, v) -> v - 1) == 0) {
                map.remove(now);
            }
            result = Math.max(set.size()+ map.size(), result);
        }
        System.out.println(result);
    }
}