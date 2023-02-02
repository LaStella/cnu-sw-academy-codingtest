import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] location = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if (location[0] == location[2] || location[1] == location[3]) {
            System.out.println(0);
            return;
        }
        System.out.println(1);
    }
}