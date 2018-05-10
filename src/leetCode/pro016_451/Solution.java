package leetCode.pro016_451;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public String frequencySort(String s) {
    	Map<Character, Integer> map = new HashMap<>();
    	PriorityQueue<Map.Entry<Character, Integer>> priorityQueue = new PriorityQueue<>(new Comparator<Map.Entry<Character, Integer>>() {

			@Override
			public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getValue()-o1.getValue();
			}
		});
    	for(Character c : s.toCharArray()) {
    		if (map.containsKey(c)) {
				map.replace(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
    	}
    	for(Map.Entry<Character, Integer> entry : map.entrySet()) {
    		priorityQueue.add(entry);
    	}
    	StringBuilder sb = new StringBuilder();
    	while (!priorityQueue.isEmpty()) {
			Map.Entry<Character, Integer> poll = priorityQueue.poll();
			for(int i=0; i<poll.getValue(); i++) {
				sb.append(poll.getKey());
			}
		}
		return sb.toString();
    }
}