package DataStructure;

class MyNode{
    int data;
    MyNode left;
    MyNode right;
}

class Tree{
    public MyNode root;
    public void setRoot(MyNode node){
        this.root = node;
    }
    public MyNode getRoot(){
        return root;
    }

    public MyNode makeNode(MyNode left, int data, MyNode right){
        MyNode node = new MyNode();
        node.data = data;
        node.left = left;
        node.right = right;
        return node;
    }

    public void inorder(MyNode node){
        if(node != null){
            inorder(node.left);
            System.out.println(node.data);
            inorder(node.right);
        }
    }
    public void preOrder(MyNode node){
        if (node != null) {
            System.out.println(node.data);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void postOrder(MyNode node){
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.data);
        }
    }
}

public class TreeOrder {
    public static void main(String[] args) {
        Tree t = new Tree();
        MyNode n4 = t.makeNode(null, 4, null);
        MyNode n5 = t.makeNode(null, 5, null);
        MyNode n2 = t.makeNode(n4, 2, n5);
        MyNode n3 = t.makeNode(null, 3, null);
        MyNode n1 = t.makeNode(n2, 1, n3);
        t.setRoot(n1);
        t.inorder(t.getRoot());
        System.out.println("==========================");
        t.preOrder(t.getRoot());
        System.out.println("==========================");
        t.postOrder(t.getRoot());

    }
}
