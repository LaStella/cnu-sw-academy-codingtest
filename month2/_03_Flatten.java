import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (String s : br.readLine().split(" ")) {
            priorityQueue.add(Integer.parseInt(s));
        }

        int min = priorityQueue.poll();
        int result = 0;

        while (!priorityQueue.isEmpty()) {
            result += priorityQueue.poll() - min;
        }

        System.out.println(result);
    }
}