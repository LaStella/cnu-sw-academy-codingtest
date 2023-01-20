
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String yut = br.readLine();
        int frontCount = 0;
        for (String s : yut.split("")){
            if (s.equals("1")) frontCount++;
        }
        int canMove = frontCount == 0 ? 5 : frontCount;
        System.out.println(canMove);
    }
}