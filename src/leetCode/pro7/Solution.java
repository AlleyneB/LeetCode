package leetCode.pro7;

class Solution {
    public int compareVersion(String version1, String version2) {
    	String[] v1Strings = version1.split("\\.");
    	String[] v2Strings = version2.split("\\.");
    	int length1 = v1Strings.length;
		int length2 = v2Strings.length;
		int j = length1 < length2 ? length1:length2;
    	for(int i=0; i<j; i++) {
    		if(Integer.parseInt(v1Strings[i]) > Integer.parseInt(v2Strings[i])) {
    			return 1;
    		}else if (Integer.parseInt(v1Strings[i]) < Integer.parseInt(v2Strings[i])) {
				return -1;
			}
    	}
    	if((length1 > length2) && (Integer.parseInt(v1Strings[length1-1]) > 0)) {
    		return 1;
    	}else if ((length1 < length2) && (Integer.parseInt(v2Strings[length2-1]) > 0)) {
    		return -1;
		}
		return 0;
    }
}