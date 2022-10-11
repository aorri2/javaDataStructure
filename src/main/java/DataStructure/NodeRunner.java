package DataStructure;

public class NodeRunner {
    public static void main(String[] args) {
        Node node = new Node<>(10);
        node.append(20);
        node.append(30);
        node.append(40);

        node.retrieve();

    }
}
