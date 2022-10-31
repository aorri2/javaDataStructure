package DataStructure;

public class IntQueue {
    private int max;
    private int front;
    private int rear;
    private int num;
    private int[] que;

    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {
        }
    }

    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {
        }
    }
    public IntQueue(int capacity){
        this.max = capacity;
        num = front = rear = 0;
        try{
            que = new int[max];
        }catch (OutOfMemoryError e){
            max = 0;
        }
    }

    public int enque(int data) throws OverflowIntQueueException{
        if(num >= max)
            throw new OverflowIntQueueException();
        que[rear++] = data;
        num++;
        if(rear == max)
            rear = 0;
        return data;
    }

    public int deque() throws EmptyIntQueueException{
        if(num <= 0)
            throw new EmptyIntQueueException();
        int data = que[front++];
        num --;
        if(front == max)
            front = 0;
        return data;
    }

    public int peek() throws EmptyIntQueueException{
        if(num <= 0)
            throw new EmptyIntQueueException();
        return que[front];
    }
    public int indexOf(int data){
        for(int loop =0; loop<num;loop++){
            int index = (loop+front)%max;
            if(que[index] == data)
                return index;
        }
        return -1;
    }

    public void clear() {
        num = front = rear = 0;
    }
    public int capacity(){
        return max;
    }
    public int size(){
        return num;
    }
    public boolean isEmpty(){
        return num <= 0;
    }
    public boolean isFull(){
        return num >= max;
    }
    public void dump() {
        if(num <= 0)
            System.out.println("큐가 비어 있습니다.");
        else{
            for(int i=0; i < num; i++)
                System.out.print(que[(i+front)%max]+" ");
            System.out.println();
        }
    }
}
