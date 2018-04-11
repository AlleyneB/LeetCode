package leetCode.pro005;

class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
    	Glass first = new Glass(0, 0);
    	first.addWater(poured);
    	Glass glass= Glass.glasses.get("g"+query_row+query_glass);
    	if(glass == null) {
    		return 0;
    	}
		return glass.getContent();
    }
}