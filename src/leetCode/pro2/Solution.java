package leetCode.pro2;
//abcde    cdeab
public class Solution {
	
	public boolean rotateStr(String A, String B) {
		if(A.length() != B.length()) return false;
		return (A+B).contains(B);
	}
	
    public boolean rotateString(String A, String B) {
    	if(A.equals(B)) return true;
		if((A != null && B != null) && A.length() == B.length()) {
    		for(int i = 1;i < A.length();i++) {
    			String A1 = A.substring(0, i);
    			String A2 = A.substring(i);
    			if((A2+A1).equals(B)) return true;
    		}
    	}
		return false;
    }
}
