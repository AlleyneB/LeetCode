package leetCode.pro9;

public class Solution {
    public int monotoneIncreasingDigits(int N) {
    	char[] digitChar = String.valueOf(N).toCharArray();
    	int i = 0;
    	boolean isChange = false;
    	for(; i<digitChar.length-1; i++) {
    		if(digitChar[i] > digitChar[i+1]) {
    			digitChar[i] = Character.forDigit(digitChar[i]-'1', 10);
    			//判断前面数字是否需要减一
    			checkBefore(digitChar,i);
    			isChange = true;
    			break;
    		}
    	}
    	//把后面数字改为9（要判断倒数第二位是否有减一）
    	for(int j=i+1; j<digitChar.length; j++) {
    		if(j == i+1) {
    			if (isChange) {
    				digitChar[j] = '9';
				}
    		}
    		digitChar[j] = '9';
    	}
		return Integer.parseInt(String.valueOf(digitChar));
    }

	private void checkBefore(char[] digitChar, int i) {
		if (i > 0) {
			if (digitChar[i] < digitChar[i-1]) {
				digitChar[i-1] = Character.forDigit(digitChar[i-1]-'1', 10);
				//若前位减一，则该位置9
				digitChar[i] = '9';
				checkBefore(digitChar, i-1);
			}
		}
	}
}
