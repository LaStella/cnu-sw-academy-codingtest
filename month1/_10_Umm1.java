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
            
            s = s.substring(a, b);
            if (s.contains("Umm")) {
                if(s.contains("UmmUmm")) {
                    System.out.println("NO");
                    continue;
                }
                System.out.println("YES");
                continue;
            }
            System.out.println("NO");
        }
    }
}