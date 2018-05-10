package leetCode.pro010_3;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
	    Set<Character> set = new HashSet<>();
	    int max =  0;
	    int length = s.length();
	    char[] chars = s.toCharArray();
		for(int i=0; i<(length-max); i++) {
	    	int thisMax = 0;
	    	for(int j=i; j<length; j++) {
	    		if (set.contains(chars[j])) {
					break;
				}else {
					set.add(chars[j]);
					thisMax++;
				}
	    	}
	    	max = (thisMax>max)?thisMax:max;
	    	set.clear();
	    }
		return max;
    }
}
