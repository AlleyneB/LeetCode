package leetCode.pro019_344;

class Solution {
    public String reverseString(String s) {
        char[] chars = s.toCharArray();
/*        char[] ans = new char[chars.length];
        for(int i = chars.length-1; i >= 0; i--){
            ans[chars.length-i-1] = chars[i];
        }*/
        char temp;
        int length = s.length();
		for(int i = 0; i < length/2; i++) {
        	temp = chars[i];
        	chars[i] = chars[length-1-i];
        	chars[length-1-i] = temp;
        }
        return String.valueOf(chars);
    }
}