package stack;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyStackTest {

    MyStack stack = new MyStack();

    @BeforeEach
    void tearUp() {
        stack.pushX(1);
        stack.pushX(2);
        stack.pushX(3);

    }

    @Test
    void pushX() {

        assertThat(stack.size()).isEqualTo(3);
    }

    @Test
    void pop() {
        int poppedData1 = stack.pop();
        assertThat(poppedData1).isEqualTo(3);
        int poppedData2 = stack.pop();
        assertThat(poppedData2).isEqualTo(2);
        int poppedData3 = stack.pop();
        assertThat(poppedData3).isEqualTo(1);
        int poppedData4 = stack.pop();
        assertThat(poppedData4).isEqualTo(-1);
    }

    @Test
    void size() {
        assertThat(stack.size()).isEqualTo(3);
    }

    @Test
    void empty() {
        assertThat(stack.empty()).isEqualTo(0);
        MyStack stack2 = new MyStack();
        assertThat(stack2.empty()).isEqualTo(1);
    }

    @Test
    void top() {
        int top = stack.top();

        assertThat(top).isEqualTo(3);
        MyStack stack2 = new MyStack();
        assertThat(stack2.top()).isEqualTo(-1);
    }
}