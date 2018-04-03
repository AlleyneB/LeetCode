package leetCode.pro8;

public class MyMain {

	public static void main(String[] args) {
		Solution solution = new Solution();
		ListNode l1 = new ListNode(0);
		l1.next = new ListNode(4);
		ListNode l2 = new ListNode(0);
		l2.next = new ListNode(3);
		//System.out.println(solution.list2Int(l1));;
		ListNode listNode = solution.addTwoNumbers(l1, l2);
		
		System.out.println(listNode.val);
		while(listNode.next != null) {
			listNode = listNode.next;
			System.out.println(listNode.val);
		}
	}
}
