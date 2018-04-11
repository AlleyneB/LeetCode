package leetCode.pro004;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> letterCasePermutation(String S) {
    	List<String> list = new ArrayList<String>();
    	//逐个遍历所给字符串
    	for(int i=0; i<S.length(); i++) {
    		char c = S.charAt(i);
    		//是数字则直接缀加
			if(Character.isDigit(c)) {
				apendChar(list,c);
    		}else {
    			//是字母，拷贝一份原数组，将大小写分别缀加到两个数组中
    			List<String> list2 = new ArrayList<>();
    			list2.addAll(list);
    			apendChar(list, c);
    			if(Character.isLowerCase(c)) {
    				apendChar(list2, Character.toUpperCase(c));
    			}else {
    				apendChar(list2, Character.toLowerCase(c));
    			}
    			//最后合并两个数组
    			list.addAll(list2);
    		}
    	}
		return list;
    }
    //将一个字符缀加到list中每个字符串后面，list为空则以该字符创建字符串
    public void apendChar(List<String> list,char c) {
		if (!list.isEmpty()) {
			for (int j = 0; j < list.size(); j++) {
				list.set(j, list.get(j) + c);
			} 
		}else {
			list.add(String.valueOf(c));
		}
    }
}
