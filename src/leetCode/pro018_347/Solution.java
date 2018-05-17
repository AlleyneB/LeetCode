package leetCode.pro018_347;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
            List<Integer> res = new ArrayList<>();
           	Map<Integer, Integer> map = new HashMap<>(); 
            PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getValue()-o1.getValue();
			}
		    });
             for(Integer num : nums) {
    		    if (map.containsKey(num)) {
				    map.replace(num, map.get(num)+1);
			    }else {
				map.put(num, 1);
			    }
             }
    	for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
    		priorityQueue.add(entry);
    	}
        for(int i=0; i<k; i++){
            if(!priorityQueue.isEmpty()){
                res.add(priorityQueue.poll().getKey());
            }
        }
		return res;
    }
}