package DAY7.Session2;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

    public static void backtracking(
            int[] nums,
            List<Integer> current,
            boolean[] visited,
            List<List<Integer>> result) {

        // Base condition
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Try every element
        for (int i = 0; i < nums.length; i++) {

            // Skip if already used
            if (visited[i]) {
                continue;
            }

            // Choose
            current.add(nums[i]);
            visited[i] = true;

            // Explore
            backtracking(nums, current, visited, result);

            // Backtrack
            current.remove(current.size() - 1);
            visited[i] = false;
        }
    }

    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        boolean[] visited = new boolean[nums.length];

        backtracking(nums, current, visited, result);

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        List<List<Integer>> result = permute(nums);

        System.out.println(result);
    }
}