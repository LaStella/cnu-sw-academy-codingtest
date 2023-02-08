import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.parallelPrefix(array, Integer::sum);

        String result = Arrays.stream(array).mapToObj(String::valueOf).reduce((i, j) -> i.concat(" ").concat(j)).get();

        System.out.println(result);
    }
}