package DataStructure;

public class IntStack {
    int max;
    int ptr;
    int[] stk;

    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {
        }

        ;
    }

    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {
        }
    }

    public IntStack(int capacity) {
        ptr = 0;
        max = capacity;
        try {
            stk = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public int push(int data) throws OverflowIntStackException {
        if (ptr >= max)
            throw new OverflowIntStackException();
        return stk[ptr++] = data;
    }

    public int pop() throws EmptyIntStackException {
        if (ptr <= 0)
            throw new EmptyIntStackException();
        return stk[--ptr];
    }

    public int peek() throws EmptyIntStackException {
        if (ptr <= 0)
            throw new EmptyIntStackException();
        return stk[ptr - 1];
    }

    public int indexOf(int data) {
        for (int loop = ptr - 1; loop >= 0; loop--)
            if (stk[loop] == data)
                return loop;
        throw new IllegalArgumentException("존재하지 않는 값입니다.");
    }

    public void clear() {
        ptr = 0;
    }

    public int capacity() {
        return max;
    }

    public int size() {
        return ptr;
    }

    public boolean isEmpty() {
        return ptr <= 0;
    }

    public boolean isFull() {
        return ptr >= max;
    }
    public void dump(){
        if(ptr <= 0)
            System.out.println("스택이 비어 있습니다.");
        else{
            for (int loop=0; loop<ptr;loop++)
                System.out.print(stk[loop]+" ");
            System.out.println();
        }
    }

}
