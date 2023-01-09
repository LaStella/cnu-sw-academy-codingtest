import java.util.Scanner;

public class _04_Ant1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        
        int count = input.length() - input.replace("#","").length();
        String answer = count > 1 ? "HELP!" : "HAHA!";
        
        System.out.println(answer);
    }
}