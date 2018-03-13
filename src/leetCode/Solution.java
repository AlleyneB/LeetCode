package leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        int length = s.length();
        int result = length;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<length;i++) {
        	if(map.containsKey(chars[i])) {
        		map.replace(chars[i], length);
        	}else {
        		map.put(chars[i], i);
        	}
        }
        Set<Character> keySet = map.keySet();
        for(char c : keySet) {
        	Integer num = map.get(c);
        	if(num < result) {
        		result = num;
        	}
        }
        if (result == length) {
			return -1;
		}
		return result;
    }
}
