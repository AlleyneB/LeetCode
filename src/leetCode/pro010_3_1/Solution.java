package leetCode.pro010_3_1;

//asdfggabs
class Solution {
    public int lengthOfLongestSubstring(String s) {
	    int max =  0;
	    int startIndex = 0;
	    char[] cs = s.toCharArray();
	    for(int i=0; i<s.length(); i++) {
	    	String temp = s.substring(startIndex, i);
	    	String c = String.valueOf(cs[i]);
			if (temp.contains(c)) {
				startIndex += (temp.indexOf(c)+1);
			}
			int length = i-startIndex+1;
			max = length>max ? length : max;
	    }
		return max;
    }
}
