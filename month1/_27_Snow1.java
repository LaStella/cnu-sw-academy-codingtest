import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        char[][] yard = new char[size][size];
        
        for (int i = 0; i < size; i++) {
            Arrays.fill(yard[i], '*');
        }
        
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int minRow = Math.min(arr[0], arr[2])-1;
        int maxRow = Math.max(arr[0], arr[2])-1;
        int minCol = Math.min(arr[1], arr[3])-1;
        int maxCol = Math.max(arr[1], arr[3])-1;
        
        for (int r = minRow; r <= maxRow; r++) {
            for (int c = minCol; c <= maxCol; c++) {
                yard[r][c] = '.';
            }
        }

        String result = Arrays.stream(yard).map(String::valueOf).collect(Collectors.joining("\n"));
        System.out.println(result);
    }
}