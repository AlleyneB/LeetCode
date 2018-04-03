package leetCode.pro8;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	int num1 = list2Int(l1);
    	int num2 = list2Int(l2);
    	int sum = num1 + num2;
		return int2List(sum);
    }

	public ListNode int2List(int sum) {
		ListNode head = new ListNode(0);
		ListNode temp = head;
		String string = Integer.toString(sum);
		for(int i=string.length()-1; i>=0; i--) {
			int digit = Integer.parseInt(string.substring(i, i+1));
			temp.next = new ListNode(digit);
			temp = temp.next;
		}
		return head.next;
	}

	public int list2Int(ListNode l) {
		StringBuilder sBuilder = new StringBuilder();
		ListNode nextNode = l;
		sBuilder.append(nextNode.val);
		while(nextNode.next != null) {
			nextNode = nextNode.next;
			sBuilder.append(nextNode.val);
		}
		return Integer.parseInt(sBuilder.reverse().toString());
	}
}
