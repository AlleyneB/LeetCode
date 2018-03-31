package leetCode.pro6;

class Solution {
    public int[] numberOfLines(int[] widths, String S) {
    	int[] ans = new int[2];
    	char[] chars = S.toCharArray();
    	int row = 1;
    	int length = 0;
    	for(int i=0; i<S.length(); i++) {
    		int charWidth = widths[Character.getNumericValue(chars[i])-10];
			length = length+charWidth;
    		if(length > 100) {
    			row++;
    			length = charWidth;
    		}
    	}
    	ans[0] = row;
    	ans[1] = length;
		return ans;
    }
}