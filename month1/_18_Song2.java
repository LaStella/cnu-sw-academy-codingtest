import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 노래 제목을 저장합니다.
        String[] a = new String[n+1];
        for (int i = 1; i <= n; i++) {
            a[i] = br.readLine();
        }
        
        // 0은 입력주어지지 않으나 질문으로 노래 누적 길이가 들어오는 경우
        // 마지막 노래가 재생되므로 a[0] = a[n]입니다.
        a[0] = a[n];

        // 노래 누적 길이를 저장합니다.
        int[] b = new int[n+1];
        for (int i = 1; i <= n; i++) {
            b[i] = b[i-1] + Integer.parseInt(br.readLine());
        }

        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (m-- > 0) {
            int q = Integer.parseInt(br.readLine());
            // 질문에 대해서 노래 누적 길이를 나눈 나머지를 구합니다.
            int remainQ = q % (b[n]);
            // 각 질문에 대해 누적 길이 이하인 경우 해당 노래의 제목을 sb에 저장합니다.
            for (int i = 0; i <= n; i++) {
                if (remainQ <= b[i]) {
                    sb.append(a[i] + "\n");
                    break;
                }
            }
        }

        System.out.println(sb);
    }
}