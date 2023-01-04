import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        
        int count = input.length() - input.replace("#","").length();
        String answer = count > 1 ? "HELP!" : "HAHA!";
        
        System.out.println(answer);
    }
}