package leetCode.pro020_33;

import java.util.Arrays;

class Solution {
    public int search(int[] nums, int target) {
    	return find(nums, target, 0);
    }
	public int find(int[] numbs, int aim , int index) {
    	int ans = -1;
    	//递归基
    	if (numbs.length == 0) {
			return ans;
		}
    	if (numbs.length == 1) {
			if (aim == numbs[0]) {
				return 0;
			}
			return ans;
		}
    	if (numbs.length == 2) {
    		if (aim == numbs[0]) {
				return index;
			}else if (aim == numbs[1]) {
				return index+1;
			}else {
				return ans;
			}
    	}
    	int mid = numbs.length/2;
    	int[] n1 = Arrays.copyOfRange(numbs, 0, mid);
    	int[] n2 = Arrays.copyOfRange(numbs, mid, numbs.length);
    	//如果n1为升序数组
    	if ( n1[0] <= n1[n1.length-1]) {
    		//若目标在n1范围，则二分查找其索引
			if (aim >= n1[0] & aim <= n1[n1.length-1]) {
				int temp = Arrays.binarySearch(n1, aim);
				if (temp < 0) {
					return -1;
				}
				return index+temp;//Arrays.binarySearch()方法：存在则返回索引，否则返回负值（不一定是-1）
			}else {//否则，find n2
				ans = find(n2, aim, mid+index);
			}
		}else {//否则若n1为乱序
			//若目标在n2，则查找之
			if (aim >= n2[0] & aim <= n2[n2.length-1]) {
				int temp = Arrays.binarySearch(n2, aim);
				if (temp < 0) {
					return -1;
				}
				return index+mid+temp;
			}else {
				//否则，find n1
				ans = find(n1, aim, index);
			}
		}
		return ans;
	}
}