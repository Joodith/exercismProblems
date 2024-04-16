import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;


import static org.assertj.core.api.Assertions.assertThat;

public class SimpleLinkedListImplTest {

    @Test
    public void aNewListIsEmpty() {
        SimpleLinkedListImpl<Integer> list = new SimpleLinkedListImpl<>();
        assertThat(list.size()).isEqualTo(0);
    }

    //    @Disabled("Remove to run test")
    @Test
    public void canCreateFromArray() {
        Character[] values = new Character[]{'1', '2', '3'};
        SimpleLinkedListImpl<Character> list = new SimpleLinkedListImpl<Character>(values);
        assertThat(list.size()).isEqualTo(3);
    }

    //    @Disabled("Remove to run test")
    @Test
    public void popOnEmptyListWillThrow() {
        SimpleLinkedListImpl<String> list = new SimpleLinkedListImpl<String>();

        assertThatExceptionOfType(NoSuchElementException.class).isThrownBy(list::pop);
    }

    //    @Disabled("Remove to run test")
    @Test
    public void popReturnsLastAddedElement() {
        SimpleLinkedListImpl<Integer> list = new SimpleLinkedListImpl<Integer>();
        list.push(9);
        list.push(8);
        assertThat(list.size()).isEqualTo(2);
        assertThat(list.pop()).isEqualTo(8);
        assertThat(list.pop()).isEqualTo(9);
        assertThat(list.size()).isEqualTo(0);
    }

    //    @Disabled("Remove to run test")
    @Test
    public void reverseReversesList() {
        SimpleLinkedListImpl<String> list = new SimpleLinkedListImpl<String>();
        list.push("9");
        list.push("8");
        list.push("7");
        list.push("6");
        list.push("5");
        list.reverse();
        assertThat(list.pop()).isEqualTo("9");
        assertThat(list.pop()).isEqualTo("8");
        assertThat(list.pop()).isEqualTo("7");
        assertThat(list.pop()).isEqualTo("6");
        assertThat(list.pop()).isEqualTo("5");
    }

    //    @Disabled("Remove to run test")
    @Test
    public void canReturnListAsArray() {
        SimpleLinkedListImpl<Character> list = new SimpleLinkedListImpl<Character>();
        list.push('9');
        list.push('8');
        list.push('7');
        list.push('6');
        list.push('5');
        Character[] expected = {'5', '6', '7', '8', '9'};
        assertThat(list.asArray(Character.class)).isEqualTo(expected);
    }

    //    @Disabled("Remove to run test")
    @Test
    public void canReturnEmptyListAsEmptyArray() {
        SimpleLinkedListImpl<Object> list = new SimpleLinkedListImpl<Object>();
        Object[] expected = {};
        assertThat(list.asArray(Object.class)).isEqualTo(expected);
    }

}


