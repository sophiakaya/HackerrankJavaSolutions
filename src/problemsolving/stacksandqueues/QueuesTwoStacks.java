package problemsolving.stacksandqueues;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Sophia Kaya
 */

class MyQueue<T> {

    private Stack<T> lastInFirstOut = new Stack<>();
    private Stack<T> firstInFirstOut = new Stack<>();

    public void enqueue(T v) {
	lastInFirstOut.push(v);
    }

    public void dequeue() {
	reverseStack();
	firstInFirstOut.pop();
    }

    public T peek() {
	reverseStack();
	return firstInFirstOut.peek();
    }

    private void reverseStack() {
	if (firstInFirstOut.empty()) {
	    while (!lastInFirstOut.empty()) {
		firstInFirstOut.push(lastInFirstOut.pop());
	    }
	}
    }

}

public class QueuesTwoStacks {

    public static void main(String[] args) {
	MyQueue<Integer> queue = new MyQueue<Integer>();

	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();

	for (int i = 0; i < n; i++) {
	    int operation = scan.nextInt();
	    if (operation == 1) { // enqueue
		queue.enqueue(scan.nextInt());
	    } else if (operation == 2) { // dequeue
		queue.dequeue();
	    } else if (operation == 3) { // print/peek
		System.out.println(queue.peek());
	    }
	}
	scan.close();
    }
}
