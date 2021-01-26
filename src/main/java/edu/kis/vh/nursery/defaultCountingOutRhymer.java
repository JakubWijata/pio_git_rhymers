package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStack;

public class defaultCountingOutRhymer {

	private IntStack intArrayStack;


	public defaultCountingOutRhymer() {
		this.intArrayStack = new IntArrayStack();
	}

	public defaultCountingOutRhymer(IntStack intArrayStack) {
		this.intArrayStack = intArrayStack;
	}

	public void countIn(int in) {
		intArrayStack.push(in);
	}

	public boolean callCheck() {
		return intArrayStack.isEmpty();
	}

	public boolean isFull() {
		return intArrayStack.isFull();
	}

	public int peekaboo() {
		return intArrayStack.top()==-1?0:intArrayStack.top();
	}

	public int countOut() {
		return intArrayStack.top()==-1?0:intArrayStack.top();
	}

}
