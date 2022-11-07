package DataStructure;

import java.util.LinkedList;

public class AdjacencyList {
    //  1
    // |  |
    // 2  3
    //     |
    //     4
    private LinkedList<Integer>[] adj;
    private int v;

    public AdjacencyList(int v){
        super();
        this.v = v;
        adj = new LinkedList[v + 1];

        for (int i = 0; i < v + 1; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v1, int v2){
        adj[v1].add(v2);
        adj[v2].add(v1);
    }

    public void printGraph(){
        for (int i = 0; i < adj.length; i++) {
            LinkedList<Integer> node = adj[i];
            if(i == 0){
                continue;
            }
            System.out.println("node"+i+" 인접 노드 : " + node);
        }
    }

    public static void main(String[] args) {
        AdjacencyList ajl = new AdjacencyList(5);
        ajl.addEdge(1,2);
        ajl.addEdge(1,3);
        ajl.addEdge(1,4);
        ajl.addEdge(3,4);
        ajl.printGraph();
    }
}
