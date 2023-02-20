import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> stack = new Stack<>();
        for (char c : br.readLine().toCharArray()) {
            if (c == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    // 스택이 비어있지 않도록 채워준다.
                    stack.push('.');
                    break;
                }
                stack.pop();
                continue;
            }
            stack.push(c);
        }

        String answer = stack.size() == 0 ? "YES" : "NO";

        System.out.println(answer);
    }
}