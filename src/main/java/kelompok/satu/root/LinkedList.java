package kelompok.satu.root;

public class LinkedList<T> {
    private int size = 0;
    private Node<T> firstNode;
    private Node<T> lastNode;

    public LinkedList() {
    }

    private void linkFirst(T el) {
        final Node<T> f = firstNode;
        final Node<T> newNode = new Node<>(null, el, f);
        firstNode = newNode;
        if (f == null)
            lastNode = newNode;
        else
            f.setPrev(newNode);

        size++;
    }

    void linkLast(T e) {
        final Node<T> l = lastNode;
        final Node<T> newNode = new Node<>(l, e, null);
        lastNode = newNode;
        if (l == null)
            firstNode = newNode;
        else
            l.setNext(newNode);
        size++;
    }

    private T unlinkFirst(Node<T> f) {
        final T element = f.getData();
        final Node<T> next = f.getNext();
        f.setData(null);
        f.setNext(null);
        this.firstNode = next;
        if (next == null)
            this.lastNode = null;
        else
            next.setPrev(null);
        size--;

        return element;
    }

    private T unlinkLast(Node<T> l) {
        final T element = l.getData();
        final Node<T> prev = l.getPrev();
        l.setData(null);
        l.setPrev(null);
        this.lastNode = prev;
        if (prev == null)
            this.firstNode = null;
        else
            prev.setNext(null);
        size--;

        return element;
    }

    private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Ukuran: "+size;
    }

    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }

    private void checkElementIndex(int index) {
        if (!isElementIndex(index))
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }

    Node<T> node(int index) {
        if (index < (size >> 1)) {
            Node<T> x = firstNode;
            for (int i = 0; i < index; i++)
                x = x.getNext();
            return x;
        } else {
            Node<T> x = lastNode;
            for (int i = size - 1; i > index; i--)
                x = x.getPrev();
            return x;
        }
    }

    public T get(int index) {
        checkElementIndex(index);
        return node(index).getData();
    }

    public T getFirst() throws Exception {
        final Node<T> f = firstNode;
        if (f == null)
            throw new Exception("Data masih kosong");
        return f.getData();
    }

    public Node getFirstNode() throws Exception {
        final Node<T> f = firstNode;
        if (f == null)
            throw new Exception("Data masih kosong");
        return f;
    }

    public T getLast() throws Exception {
        final Node<T> l = lastNode;
        if (l == null)
            throw new Exception("Data masih kosong");
        return l.getData();
    }

    public T set(int i, T e) throws IndexOutOfBoundsException {
        Node<T> current = firstNode;
        Node<T> setNode = new Node<T>(e);

        if(i==0) {
            this.addFirst(e);
        } else if(i==this.size){
            this.addLast(e);
        } else {
            for(int j=0; current != null && j < (i-1);j++) {
                current = current.getNext();
            }
            current.setData(e);
        }

        return setNode.getData();
    }


    public void addFirst(T e) {
        linkFirst(e);
    }
    public void addLast(T e) {
        linkLast(e);
    }

    public T removeFirst() throws Exception {
        final Node<T> f = firstNode;
        if (f == null)
            throw new Exception("Data masih kosong");
        return unlinkFirst(f);
    }

    public T removeLast() throws Exception {
        final Node<T> l = lastNode;
        if (l == null)
            throw new Exception("Data masih kosong");
        return unlinkLast(l);
    }

    public int indexOf(Object o) {
        int index = 0;
        if (o == null) {
            for (Node<T> x = firstNode; x != null; x = x.getNext()) {
                if (x.getData() == null)
                    return index;
                index++;
            }
        } else {
            for (Node<T> x = firstNode; x != null; x = x.getNext()) {
                if (o.equals(x.getData()))
                    return index;
                index++;
            }
        }
        return -1;
    }

    public Node<T> search(int index) {
        Node<T> x;

        if (index < (size >> 1)) {
            x = firstNode;
            for (int i = 0; i < index; i++) {
                x = x.getNext();
            }
        } else {
            x = lastNode;
            for (int i = size - 1; i > index; i--) {
                x = x.getPrev();
            }
        }
        return x;
    }

    public void swap (int firstIndex, int secIndex) throws Exception {
        Node<T> temp = new Node<>(null, null, null);

        if (firstIndex < 0 || secIndex < 0 || firstIndex >= size || secIndex >= size) {
            throw new Exception("Index diluar jangkauan");
        }

        if (firstIndex == secIndex) {
            throw new Exception("Index sama");
        }

        Node<T> firstNode = search(firstIndex);
        Node<T> secondNode = search(secIndex);

        temp.setData(firstNode.getData());
        firstNode.setData(secondNode.getData());
        secondNode.setData(temp.getData());
    }

    public Node bubbleSort( Node start)
    {
        int swap;
        Node current;
        Node prev = null;
        if (start == null)
            return null;
        
        do {
            swap = 0;
            current = start;
            while (current.getNext() != prev)
            {
                if ((Integer) current.getData() > (Integer) current.getNext().getData())
                {
                    Integer temp = (Integer) current.getData();
                    current.setData(current.getNext().getData());
                    current.getNext().setData(temp);
                    swap = 1;
                }
                current = current.getNext();
            }
            prev = current;
        } while (swap != 0);

        return start;
    }

    public int getSize() {
        return size;
    }
}
