import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String s = sc.next();
            
            int count = 0;
            // 입구 또는 출구 확인 여부
            boolean flag = false;
            
            for (int i = 0 ; i < n ; i++) {
                if(flag) {
                    // 이미 입구 또는 출구를 찾았으므로 탈출이 가능합니다.
                    if (s.charAt(i) == '@' || s.charAt(i) == 'O') {
                        System.out.println("HAHA!");
                        break;
                    }
                    // 입구와 출구 사이에 벽이 존재하는 경우
                    if (s.charAt(i) == '#') {
                        // m개 보다 많은 벽이 존재하면 탈출이 불가능합니다.
                        if(++count > m) {
                            System.out.println("HELP!");
                            break;
                        }
                    }
                    continue;
                }
                // 입구 또는 출구를 찾을 때까지 모든 문자를 무시합니다.
                if (s.charAt(i) == '@' || s.charAt(i) == 'O') {
                    flag = true;
                }
            }
        }
    }
}