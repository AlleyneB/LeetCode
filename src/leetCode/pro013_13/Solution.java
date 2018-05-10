package leetCode.pro013_13;

class Solution {
    public int romanToInt(String s) {
    	char[] chars = s.toCharArray();
        int result = getNum(chars[chars.length-1]);
		for(int i=s.length()-1; i>0; i--) {
        	if (getNum(chars[i-1]) < getNum(chars[i])) {
				result -= getNum(chars[i-1]);
			}else {
				result += getNum(chars[i-1]);
			}
        }
    	return result;
    }

	private int getNum(char c) {
		int num = 0;
		switch (c) {
		case 'I':
			num = 1;
			break;
		case 'V':
			num = 5;
			break;
		case 'X':
			num = 10;
			break;
		case 'L':
			num = 50;
			break;
		case 'C':
			num = 100;
			break;
		case 'D':
			num = 500;
			break;
		case 'M':
			num = 1000;
			break;

		default:
			break;
		}
		return num;
	}
}