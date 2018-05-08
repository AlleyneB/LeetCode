package leetCode.pro015;

import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int maxProduct(String[] words) {
    	int result = 0;
    	String[] sortedWords = sort(words);
    	for(int i=0; i<words.length; i++) {
    		for(int j=i; j<words.length; j++) {
    			if(check(sortedWords[i],sortedWords[j])) {
    				int temp = sortedWords[i].length()*sortedWords[j].length();
    				result = (temp>result?temp:result);
    				break;
    			}
    		}
    	}
		return result;
    }
/**
 * 检查两个字符串是否有相同字符
 * @param string1
 * @param string2
 * @return
 */
	public boolean check(String string1, String string2) {
		char[] chars1 = string1.toCharArray();
		for(char c:chars1) {
			if (string2.indexOf(""+c) != -1) {
				return false;
			}
		}
		return (string1.length()==0)&&(string2.length()==0)?false:true;
	}
/**
 * 将字符串数组按照字符串长度排序
 * @param words
 * @return
 */
	public String[] sort(String[] words) {
		int length = words.length;
		String[] sortedWords = new String[length];
		PriorityQueue<String> pQueue = new PriorityQueue<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.length()-o1.length();
			}
		});
		for(String string:words) {
			pQueue.add(string);
		}
		for(int i=0; i<length; i++) {
			sortedWords[i] = pQueue.poll();
		}
		return sortedWords;
	}
}