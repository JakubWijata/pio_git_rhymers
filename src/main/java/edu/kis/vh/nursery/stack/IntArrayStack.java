package edu.kis.vh.nursery.stack;

import edu.kis.vh.nursery.IntStack;

public class IntArrayStack implements IntStack {


        private int[] NUMBERS = new int[12];

        public int total = -1;

        public void push(int in) {
            if (!isFull())
                NUMBERS[++total] = in;
        }

        public boolean isEmpty() {
            return total == -1;
        }

        public boolean isFull() {
            return total==11;
        }

        public int top() {
            if (isEmpty())
                return -1;
            return NUMBERS[total];
        }

        public int pop() {
            if (isEmpty())
                return -1;
            return NUMBERS[total--];
        }

}
