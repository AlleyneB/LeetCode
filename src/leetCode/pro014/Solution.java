package leetCode.pro014;

class Solution {
    public int[] twoSum(int[] nums, int target) {
    	int[] ans = new int[2];
        for(int i=0; i<nums.length; i++) {
        	int a = target - nums[i];
				for(int j=i; j<nums.length; j++) {
					if ((a == nums[j]) && (i!=j)) {
						ans[0] = i;
						ans[1] = j;
						return ans;
					}
				}
			}
    	return nums;
    }
}
