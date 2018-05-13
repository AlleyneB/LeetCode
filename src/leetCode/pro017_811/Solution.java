package leetCode.pro017_811;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
    	Map<String, Integer > map = new HashMap<>();
        for(String cpdomain: cpdomains) {
        	String[] temp1 = cpdomain.split(" ");
        	int num = Integer.parseInt(temp1[0]);
        	String url = temp1[1];
        	String[] subs = url.split("[.]");
        	System.out.println(subs[0]);
        	//baidu com cn
        	int length = subs.length;
			for(int i=0; i<length; i++) {
        		String key = subs[length-1];
        		if (i == 1) {
					key = subs[length-2] + "." + subs[length-1];
				}else if (i == 2) {
					key = subs[0] + "." + subs[1] + "." + subs[2];
				}
        		if (map.containsKey(key)) {
					map.replace(key, map.get(key)+num);
				}else {
					map.put(key, num);
				}
        	}
        }
        List<String> res = new ArrayList<>();
        for(String key : map.keySet()) {
        	res.add(map.get(key)+" "+key);
        }
    	return res;
    }
}