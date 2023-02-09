import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.parallelPrefix(array, Integer::sum);
        int result = array[0];
        for (int i = 0 ; i < size ; i++) {
            for (int j = 0 ; j < i ; j++) {
                result = Math.max(array[i] - array[j], result);
            }
        }
        System.out.println(result);
    }
}