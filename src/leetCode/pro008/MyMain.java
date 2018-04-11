package leetCode.pro008;

public class MyMain {

	public static void main(String[] args) {
		Solution solution = new Solution();
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(8);
		
		ListNode l2 = new ListNode(2);
		l2.next = new ListNode(3);
		
		ListNode listNode = solution.addTwoNumbers(l1, l2);
		
		System.out.println(listNode.val);
		while(listNode.next != null) {
			listNode = listNode.next;
			System.out.println(listNode.val);
		}
	}
}
