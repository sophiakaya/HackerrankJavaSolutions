package Challenge30DaysOfCode.Day15LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Sophia Kaya
 */
public class Day15LinkedList {

    static LinkedList<Node> myLinkedList = new LinkedList<>();

    public static Node insert(Node head, int data) {

	Node node = new Node(data);

	if (head == null) {
	    head = node;
	} else {

	    Node start = head;
	    while (start != null) {
		if (start.next == null) {
		    start.next = node;
		    break;
		}
		start = start.next;
	    }
	}

	return head;
    }

    public static void display(Node head) {
	Node start = head;
	while (start != null) {
	    System.out.print(start.data + " ");
	    start = start.next;
	}
    }

    public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Node head = null;
	int N = sc.nextInt();

	while (N-- > 0) {
	    int ele = sc.nextInt();
	    head = insert(head, ele);
	}
	display(head);
	sc.close();
    }
}
