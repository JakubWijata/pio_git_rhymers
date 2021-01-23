package edu.kis.vh.nursery.list;

/**
 * linked lise zawierajaca element typu int
 */
public class IntLinkedList {
    public static final int DEFAULT_VALUE = -1;

    private Node last;
    private int i;

    /**
     *
     * @param i wartość dodawana do linkedlist
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     *
     * @return true jesli linkedList jest pusta
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     *
     * @return true jesli linkedlist jest pelna
     */
    public boolean isFull() {
        return false;
    }

    /**
     *
     * @return zwraca ostatnio dodany element
     */
    public int top() {
        if (isEmpty())
            return DEFAULT_VALUE;
        return last.getValue();

    }
    /**
     *
     * @return zwraca ostatnio dodany element i usuwa go
     */
    public int pop() {
        if (isEmpty())
            return DEFAULT_VALUE;
        int ret = last.getValue();
        last = last.getPrev();

        return ret;
    }


    class Node {


        private int value;
        private Node prev;
        private Node next;


        public Node(int i) {
            setValue(i);
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
