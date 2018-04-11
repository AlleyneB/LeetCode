package leetCode.pro008;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	//保存结果的起始节点
    	ListNode head = new ListNode(0);
    	//循环用临时节点
    	ListNode temp = head;
    	int x = l1.val;
    	int y = l2.val;
    	//和
    	int sum = x + y ;
    	//进位
    	int ca = sum/10;
    	//个数部分
    	int dig = sum%10;
    	head.val = dig;
    	while((l1.next != null) || (l2.next != null)) {
    		if (l1.next != null) {
				l1 = l1.next;
				x = l1.val;
			}else {
				x = 0;
			}
    		if (l2.next != null) {
    			l2 = l2.next;
    			y = l2.val;
    		}else {
				y = 0;
			}
    		sum = x + y + ca;
    		ca = sum/10;
    		dig = sum%10;
    		temp.next = new ListNode(dig);
    		temp = temp.next;
    	}
    	if(ca != 0) {
    		temp.next = new ListNode(ca);
    	}
		return head;
	}
}
