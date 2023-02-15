// [하] 블럭 옮기기
// 입력 A, B
// 출력 두 탑의 최소 차이, 블럭 이동 최소 횟수
// 1 6 -> 1 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        if (a == b) {
            System.out.println(0 + " " + 0);
            return;
        }
        int totalBlock = a+b;
        int minDiff = totalBlock % 2;
        int moveCount = totalBlock/2 - Math.min(a, b);

        System.out.println(minDiff + " " + moveCount);
    }
}