package leetCode.pro005_799;

import java.util.HashMap;
import java.util.Map;

public class Glass {
	
	public static Map<String, Glass> glasses = new HashMap<>();
	
	int floor;
	int index;
	private Glass lChild;
	private Glass rChild;
	private double content;
	
	//构造器
	public Glass(int floor, int index) {
		super();
		glasses.put("g"+floor+index, this);
		this.floor = floor;
		this.index = index;
	}
	
	public double getContent() {
		return content;
	}
	
	//加水方法
	public void addWater(double x) {
		content = content+x;
		double spill = content-1;
		if(spill > 0) {
			content = 1;
			int lf = floor + 1;
			int li = index;
			lChild = glasses.get("g"+lf+li);
			if (lChild == null) {
				lChild = new Glass(lf, li);
			}
			lChild.addWater(spill/2);
			
			int rf = floor+1;
			int ri = index+1;
			rChild = glasses.get("g"+rf+ri);
			if (rChild == null) {
				rChild = new Glass(rf, ri);
			}
			rChild.addWater(spill/2);
		}
	}
}
