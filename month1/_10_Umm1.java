import java.util.Scanner;

public class _10_Umm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-->0) {
            int n = sc.nextInt();
            String s = sc.next();
            int a = sc.nextInt()-1;
            int b = sc.nextInt();
            boolean isUmm = false;
            
            // 첫글자가 U인지 확인합니다.
            if (s.charAt(a) == 'U') {
                int count = 0;
                for (int i = a+1 ; i < b ; i++) {
                    // 다른 U가 존재하면 Umm문자열이 아닙니다.
                    if (s.charAt(i) == 'U') {
                        isUmm = false;
                        break;
                    }
                    // U가아닌 문자는 m뿐이므로 m의 개수를 증가시키며, 2개 이상인 경우 Umm문자열입니다.
                    if (++count > 1) isUmm = true;
                }
            }
            
            if (isUmm) {
                System.out.println("YES");
                continue;
            }
            
            System.out.println("NO");
        }
    }
}