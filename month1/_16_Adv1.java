import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _16_Adv1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            String[][] map = new String[n][m];
            Node node = new Node();
            for (int i = 0; i < n; i++) {
                String line = br.readLine();
                if (line.contains("@")) {
                    node.row = i;
                    node.col = line.indexOf("@");
                }
                map[i] = line.split("");
            }
            int k = Integer.parseInt(br.readLine());
            String input = br.readLine();
            for (String i : input.split("")) {
                move(node, i, map);
            }

            sb.append((node.row+1) + " " + (node.col+1) + "\n");
        }
        System.out.println(sb);
    }

    public static boolean outOfMap(int row, int col, int n, int m) {
        return row < 0 || row >= n || col < 0 || col >= m;
    }

    public static void move(Node node, String i, String[][] map) {
        int row = node.row;
        int col = node.col;
        switch (i) {
            case "R":
                col++;
                break;
            case "L":
                col--;
                break;
            case "D":
                row++;
                break;
            default:
                row--;
                break;
        }
        if (outOfMap(row, col, map.length, map[0].length)) return;
        if (map[row][col].equals("#")) return;
        node.row = row;
        node.col = col;
    }
}

class Node {
    int row;
    int col;
}