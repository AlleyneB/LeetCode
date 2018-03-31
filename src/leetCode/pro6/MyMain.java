package leetCode.pro6;

public class MyMain {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] a =new int[26];
		for(int i=0;i<26; i++) {
			a[i] = 10;
		}
		System.out.println(solution.numberOfLines(a, "bbbcccdddaaa")[1]);
	}
}
