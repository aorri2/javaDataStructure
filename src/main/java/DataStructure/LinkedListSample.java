package DataStructure;

class LinkedListSample {
    Node header;

    static class Node {
        int data;
        Node next = null;
    }

    LinkedListSample() {
        header = new Node();
    }

    void append(int data) {
        Node end = new Node();
        end.data = data;
        Node n = header;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    Node get(int data) {
        Node foundNode = header;
        while (foundNode.next != null) {
            if (foundNode.data == data){
                return foundNode;
            }
            else{
                foundNode = foundNode.next;
            }
        }
        return foundNode;
    }

    void delete(int d) {
        Node n = header.next;
        while (n.next != null) {
            if (n.next.data == d) {
                n.next = n.next.next;
            } else {
                n = n.next;
            }
        }
    }

    void retrieve() {
        Node n = header.next;
        while (n.next != null) {
            System.out.print(n.data + "->");
            n = n.next;
        }
        System.out.println(n.data);
    }


    void removeDuplicate() {
        Node n = header;
        while (n != null && n.next != null) {
            Node r = n;
            while (r.next != null) {
                if (n.data == r.next.data) {
                    r.next = r.next.next;
                } else {
                    r = r.next;
                }
            }
            n = n.next;
        }
    }

    static class Reference {
        public int count = 0;
    }

    Node kthToLast(Node n, int k, Reference r) {
        if (n == null) {
            return null;
        }
        Node found = kthToLast(n.next, k, r);
        r.count++;
        if (r.count == k) {
            return n;
        }
        return found;
    }

    boolean deleteNode(Node n) {
        if (n == null || n.next == null) {
            return false;
        }
        Node next = n.next;
        n.data = next.data;
        n.next = next.next;
        return true;
    }
}


class LinkedListNode {
    public static void main(String[] args) {
        LinkedListSample ls = new LinkedListSample();
        ls.append(1);
        ls.append(2);
        ls.append(3);
        ls.append(4);
        ls.append(4);
        ls.append(7);
        ls.append(9);
        ls.deleteNode(ls.get(3));
        ls.removeDuplicate();
        ls.retrieve();
        LinkedListSample.Reference r = new LinkedListSample.Reference();
        LinkedListSample.Node node = ls.kthToLast(ls.header, 2, r);
//        System.out.println(node.data);
    }
}
