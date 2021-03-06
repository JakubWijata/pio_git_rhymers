package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    public static final int INITIAL_INDEX = -1;
    public static final int DEFAULT_VALUE = -1;
    public static final int MAX_SIZE = 12;

    private final int[] numbers = new int[MAX_SIZE];


    public int total = INITIAL_INDEX;

    public int getTotal() {
        return total;
    }





    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == DEFAULT_VALUE;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total];

    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;

        return numbers[total--];
    }

}
