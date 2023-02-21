import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> rightPageStack = new Stack<>();
        Stack<Character> leftPageStack = new Stack<>();
        char[] page = br.readLine().toCharArray();
        for (int i = page.length-1 ; i >= 0 ; i--) {
            rightPageStack.push(page[i]);
        }
        leftPageStack.push(rightPageStack.pop());

        int querySize = Integer.parseInt(br.readLine());
        while (querySize-- > 0) {
            String[] query = br.readLine().split(" ");
            if (query[0].equals("move")) {
                pageMove(rightPageStack, leftPageStack, query[1]);
                continue;
            }
            pageTear(rightPageStack, leftPageStack, query[1]);
        }

        System.out.println(leftPageStack.peek() + " " + rightPageStack.peek());
    }

    private static void pageMove(Stack<Character> rightPageStack, Stack<Character> leftPageStack, String direction) {
        if (direction.equals("right")) {
            if (rightPageStack.size() == 1) return;
            leftPageStack.push(rightPageStack.pop());
            return;
        }
        if (leftPageStack.size() == 1) return;
        rightPageStack.push(leftPageStack.pop());
    }    
    
    private static void pageTear(Stack<Character> rightPageStack, Stack<Character> leftPageStack, String direction) {
        if (direction.equals("right")) {
            if (rightPageStack.size() == 1) return;
            rightPageStack.pop();
            return;
        }
        if (leftPageStack.size() == 1) return;
        leftPageStack.pop();
    }
}