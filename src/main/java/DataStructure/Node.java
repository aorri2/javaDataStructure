package DataStructure;

public class Node<T> {
    T data;
    Node next = null;
    Node(T data){
        this.data = data;
    }

    void append(T data){
        Node end = new Node(data);
        Node n = this;
        while(n.next != null){
            n = n.next;
        }
        n.next = end;
    }
    void delete(T d){
        Node n = this;
        while(n.next != null){
            if(n.next.data == d){
                n.next = n.next.next;
            }else{
                n = n.next;
            }
        }
    }

    void retrieve(){
        Node n = this;
        while(n.next != null){
            System.out.print(n.data+"->");
            n = n.next;
        }
        System.out.println(n.data);
    }
}
