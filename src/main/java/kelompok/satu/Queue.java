package kelompok.satu;

import kelompok.satu.root.LinkedList;

public class Queue<T> extends LinkedList {
    public boolean hasPop() {
        if (this.getSize() == 0) {
            return false;
        } else {
            return true;
        }
    }

    public void offer(T el) {
        addLast(el);
    }

    public int pop() throws Exception {
        var firstEl = removeFirst();

        return indexOf(firstEl); // remove first element and return the value
    }

    @Override
    public String toString() {
        String dataDisplay = "";

        for (int i = 0; i < getSize(); i++) {
            if (search(i) != null) {
                if (i == getSize() - 1) {
                    dataDisplay += String.format("%s", search(i).getData());
                } else {
                    dataDisplay += String.format("%s -> ", search(i).getData());
                }

//                dataDisplay += String.format("%s -> ", search(i).getData());
            }
        }

        return dataDisplay;
    }
}
