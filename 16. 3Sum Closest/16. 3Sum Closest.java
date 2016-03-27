public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = Integer.MAX_VALUE;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i ++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            int lo = i + 1, hi = nums.length -1;
            while (lo < hi) {
                int sum = nums[i] + nums[lo] + nums[hi];
                if (Math.abs(target - sum) < closest) {
                    closest = Math.abs(target - sum);
                    res = sum;
                }
                
                if      (sum < target) lo++;
                else if (sum > target) hi--;
                else                   return sum; 
                
            }
        }
        return res;
    }
}