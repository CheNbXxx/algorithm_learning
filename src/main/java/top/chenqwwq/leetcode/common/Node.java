package top.chenqwwq.leetcode.common;

/**
 * @author chen
 * @date 2021-09-24
 **/
public class Node {
	public int val;
	public Node prev;
	public Node next;
	public Node child;

	public Node(int val) {
		this.val = val;
	}

	public Node(int val, Node prev, Node next, Node child) {
		this.val = val;
		this.prev = prev;
		this.next = next;
		this.child = child;
	}
}
