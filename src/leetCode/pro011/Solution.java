package leetCode.pro011;

import java.util.ArrayDeque;

class Solution {
    public boolean isValid(String s) {
    	ArrayDeque<Character> stack = new ArrayDeque<>();
    	for(Character c:s.toCharArray()) {
    		switch (c) {
			case '(':
				stack.push('(');
				break;
			case ')':
				if(stack.peek()!=null && stack.peek().equals('(')) {
					stack.pop();
				}else {
					return false;
				}
				break;
			case '[':
				stack.push('[');
				break;
			case ']':
				if(stack.peek()!=null && stack.peek().equals('[')) {
					stack.pop();
				}else {
					return false;
				}
				break;
			case '{':
				stack.push('{');
				break;
			case '}':
				if(stack.peek()!=null && stack.peek().equals('{')) {
					stack.pop();
				}else {
					return false;
				}
				break;
			default:
				break;
			}
    	}
		return stack.isEmpty();
    }
}
