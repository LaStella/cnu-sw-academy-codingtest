import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numbOfBuilding = Integer.parseInt(br.readLine());

        int[] buildingHeight = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxLeftHeight = 0;
        int leftSideCount = 0;
        int maxRightHeight = 0;
        int rightSideCount = 0;
        for (int i = 0; i < numbOfBuilding; i++) {
            if (buildingHeight[i] > maxLeftHeight) {
                maxLeftHeight = buildingHeight[i];
                leftSideCount++;
            }
            if (buildingHeight[numbOfBuilding - 1 - i] > maxRightHeight) {
                maxRightHeight = buildingHeight[numbOfBuilding - 1 - i];
                rightSideCount++;
            }
        }

        System.out.println(leftSideCount + " " + rightSideCount);
    }
}