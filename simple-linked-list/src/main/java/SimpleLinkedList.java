import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

class SimpleLinkedList<T> {
     public List<T> linkedList;
    SimpleLinkedList() {
        linkedList=new LinkedList<>();
    }

    SimpleLinkedList(T[] values) {
        linkedList=new LinkedList<>(Arrays.asList(values));
    }

    void push(T value) {
        linkedList.add(value);
    }

    T pop() {
        if(size()>0) return linkedList.removeLast();
        throw new NoSuchElementException();
    }

    void reverse() {
        linkedList = linkedList.reversed();
    }

    T[] asArray(Class<T> clazz) {

        return linkedList.reversed().toArray((T[]) Array.newInstance(clazz,size()));
    }

    int size() {
        return linkedList.size();
    }
}
