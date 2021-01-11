package edu.kis.vh.nursery.list;

public class Node {

	private int value;
	private Node prev, next;

	Node(int value) {
		this.value = value;
	}

	int getValue() {
		return value;
	}

	Node getPrev() {
		return prev;
	}

	void setPrev(Node prev) {
		this.prev = prev;
	}

	Node getNext() {
		return next;
	}

	void setNext(Node next) {
		this.next = next;
	}
}
