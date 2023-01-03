import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String inNumber = br.readLine();
        
        StringTokenizer st = new StringTokenizer(inNumber);
        
        int[] sum = new int[n+1];
        
        for (int i=1 ; i<=n ; i++) {
            sum[i] = sum[i-1] + Integer.parseInt(st.nextToken());
        }

        int q = Integer.parseInt(br.readLine());
        
        while(q-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            int result = sum[b] - sum[a-1];
            bw.write(result+"\n");
        }
        bw.flush();
        bw.close();

    }
}