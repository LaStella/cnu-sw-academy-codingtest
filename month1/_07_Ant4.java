import java.util.Scanner;

public class _07_Ant4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String s = sc.next();
            double atk_j = sc.nextInt();
            double hp_j = sc.nextInt();
            double atk_m = sc.nextInt();
            double hp_m = sc.nextInt();
            boolean canWin = Math.ceil(hp_m/atk_j) > Math.ceil(hp_j/atk_m) ? false : true;

            int start = s.indexOf("@");

            boolean canEscape = false;

            for (int i=0 ; i<n ;i++) {
                if (s.charAt(i) == 'O') {
                    String startToEnd = start > i ? s.substring(i+1, start) : s.substring(start+1, i);
                    int count = startToEnd.length() - startToEnd.replace("#","").length();
                    if (count <= m) {
                        if (startToEnd.contains("&") && !canWin) {
                            continue;
                        }
                        canEscape = true;
                        break;
                    }
                }
            }

            if (canEscape) {
                System.out.println("HAHA!");
                continue;
            }
            System.out.println("HELP!");
        }
    }
}