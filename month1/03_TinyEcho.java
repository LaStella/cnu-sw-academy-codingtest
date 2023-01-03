import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bread_1 = sc.next();
        int bread_1_cost = sc.nextInt();
        
        String bread_2 = sc.next();
        int bread_2_cost = sc.nextInt();

        System.out.println(bread_1_cost > bread_2_cost ? bread_1 : bread_2);
    }
}