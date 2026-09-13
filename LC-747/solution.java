import java.util.Arrays;

class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        int[] copy = Arrays.copyOf(nums, n);
        
        Arrays.sort(copy);
        
        int largest = copy[n - 1];
        int secondLargest = copy[n - 2];
        
        if (largest >= 2 * secondLargest) {
            // find index of largest in original nums
            for (int i = 0; i < n; i++) {
                if (nums[i] == largest) {
                    return i;
                }
            }
        }
        return -1;
    }
}
