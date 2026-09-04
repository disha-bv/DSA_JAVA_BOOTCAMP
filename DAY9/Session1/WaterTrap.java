package DAY9.Session1;

import java.util.ArrayList;
import java.util.List;

public class WaterTrap {

    public static int trap(int[] height) {
        int n = height.length;

        if (n == 0) {
            return 0;
        }

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        // Left maximum
        left.add(height[0]);

        for (int i = 1; i < n; i++) {
            left.add(Math.max(left.get(i - 1), height[i]));
        }

        // Right maximum
        right.add(height[n - 1]);

        for (int i = n - 2; i >= 0; i--) {
            right.add(0, Math.max(height[i], right.get(0)));
        }

        // Calculate trapped water
        int result = 0;

        for (int i = 0; i < n; i++) {
            int units = Math.min(left.get(i), right.get(i)) - height[i];
            result += units;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] height = {4, 2, 0, 3, 2, 5};

        System.out.println(trap(height));
    }
}