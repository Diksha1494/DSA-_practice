// Problem: Container With Most Water (LeetCode #11)




// ================= Brute Force Code =================
// Time Complexity: O(n²)
// Space Complexity: O(1)

public int maxArea(int[] height) {
    int n = height.length;
    int ans = 0;

    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            int w = j - i;                               // Width
            int h = Math.min(height[i], height[j]);      // Minimum height
            int max_water = w * h;                       // Area between lines
            ans = Math.max(ans, max_water);              // Update maximum
        }
    }
    return ans;
}

// Approach: Two Pointers
// Time: O(n)
// Space: O(1)

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int ans = 0;

        while (left < right) {
            int width = right - left;                            // Distance between pointers
            int h = Math.min(height[left], height[right]);        // Limiting height
            ans = Math.max(ans, width * h);                       // Update max area

            // Move the pointer at smaller height
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return ans;
    }

    public static void main(String[] args) {
        ContainerWithMostWater obj = new ContainerWithMostWater();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Max Area: " + obj.maxArea(height));
    }
}
