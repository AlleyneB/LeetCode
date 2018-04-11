package leetCode.pro010;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
	    Set<Character> set = new HashSet<>();
	    int max =  0;
	    for(int i=0; i<(s.length()-max); i++) {
	    	int thisMax = 0;
	    	for(int j=i; j<s.length(); j++) {
	    		if (set.contains(s.charAt(j))) {
					break;
				}else {
					set.add(s.charAt(j));
					thisMax++;
				}
	    	}
	    	max = (thisMax>max)?thisMax:max;
	    	set.clear();
	    }
		return max;
    }
}
