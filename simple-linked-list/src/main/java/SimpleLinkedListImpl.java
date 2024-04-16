import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class SimpleLinkedListImpl<T> {
    private Node head;
    private Node tail;
    private int size = 0;

    SimpleLinkedListImpl() {
    }

    SimpleLinkedListImpl(T[] values) {
        Arrays.stream(values).forEach(this::push);
    }

    void push(T value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
        }
        tail.setNext(node);
        tail = node;
        size++;
    }

    T pop() {
        if (tail == null) throw new NoSuchElementException();
        T poppedElem = tail.data;
        size--;
        if (head == tail) {
            head = null;
            tail = null;
            return poppedElem;
        }
        Node tmp = head;
        while (tmp.getNext() != tail) {
            tmp = tmp.getNext();
        }
        tail = tmp;
        return poppedElem;

    }

    void reverse() {
        Node tmp = head;
        Node prevNode = null;
        Node nextNode;
        tail = head;
        while (tmp != null) {
            nextNode = tmp.next;
            tmp.next = prevNode;
            prevNode = tmp;
            tmp = nextNode;
            if (tmp != null) head = tmp;
        }


    }

    T[] asArray(Class<T> clazz) {
       T[] arr=(T[]) Array.newInstance(clazz,size);
       Node tmp=head;
       for(int i=size-1;i>=0;i--){
           arr[i]=tmp.data;
           tmp=tmp.getNext();

       }
       return arr;

    }

    int size() {
        return size;
    }

    class Node {
        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;

        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return this.next;
        }

        public void setNext(Node node) {
            this.next = node;
        }
    }
}
