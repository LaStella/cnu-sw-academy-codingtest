// [하] 야바위
// 입력 : 첫째줄 정수 N M, 둘때줄부터 M개의 줄에 정수 U, V
// 출력 : 섞는 과정이 끝난 후 컵에 들어있는 정수를 순서대로 출력
// 5 3
// 1 2
// 1 3
// 1 4
// 4 1 2 3 5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(String.valueOf(i+1));
        }
        int querySize = Integer.parseInt(st.nextToken());
        while (querySize-- > 0) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken())-1;
            int v = Integer.parseInt(st.nextToken())-1;
            Collections.swap(list, u, v);
        }

        String result = list.stream().reduce((i, j) -> i.concat(" ").concat(j)).get();
        System.out.println(result);
    }
}
