package leetCode.pro003;

public class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
    	int[] topSkyline = get2DArrayColumnMaxNum(grid);
    	int[] leftSkyline = get2DArrayRowMaxNum(grid);
		return calMaxHeight(grid,topSkyline,leftSkyline);
    }

    //累加每个楼的增量
	private int calMaxHeight(int[][] grid, int[] topSkyline, int[] leftSkyline) {
		int result = 0;
		for(int i=0; i<leftSkyline.length; i++) {
			for(int j=0; j<topSkyline.length; j++) {
				result += calIncrement(grid[i][j], leftSkyline[i], topSkyline[j]);
			}
		}
		return result;
	}

	//计算一个楼的增量
	private int calIncrement(int num, int a, int b) {
		if(a<b) {
			return a-num;
		}
		return b-num;
	}

	//获取二维数组每行的最大值
	private int[] get2DArrayRowMaxNum(int[][] grid) {
		int[] result = new int[grid.length];
		for(int i=0; i<grid.length; i++) {
			int max = grid[i][0];
			for(int j=0; j<grid[0].length; j++) {
				if(grid[i][j] > max) {
					max = grid[i][j];
				}
			}
			result[i] = max;
		}
		return result;
	}

	//获取二维数组每列的最大值
	private int[] get2DArrayColumnMaxNum(int[][] grid) {
		int[] result = new int[grid[0].length];
		for(int i=0; i<grid[0].length; i++) {
			int max = grid[0][i];
			for(int j=0; j<grid.length; j++) {
				if(grid[j][i] > max) {
					max = grid[j][i];
				}
			}
			result[i] = max;
		}
		return result;
	}
}
