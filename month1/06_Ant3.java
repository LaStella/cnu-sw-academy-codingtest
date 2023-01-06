import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String s = sc.next();
            
            int start = s.indexOf("@");
            int end = s.indexOf("O");
            int gauntlet = s.indexOf("G");
            
            String startToEnd = start > end ? s.substring(end+1, start) : s.substring(start+1, end);
            int count = startToEnd.length() - startToEnd.replace("#","").length();
            if (count <= m) {
                System.out.println("HAHA!");
                continue;
            }
            
            String startToGauntlet = start > gauntlet ? s.substring(gauntlet+1, start) : s.substring(start+1, gauntlet);
            count = startToGauntlet.length() - startToGauntlet.replace("#","").length();
            if (count <= m) {
                System.out.println("HAHA!");
                continue;
            }
            
            System.out.println("HELP!");
            
        }
    }
}