package stack;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        Scanner sc = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String operation = sc.next();

            switch (operation) {
                case "push":
                    stack.pushX(sc.nextInt());
                    break;
                case "pop":
                    stringBuilder.append(stack.pop()).append("\n");
                    break;
                case "size":
                    stringBuilder.append(stack.size()).append("\n");
                    break;
                case "empty":
                    stringBuilder.append(stack.empty()).append("\n");
                    break;
                case "top":
                    stringBuilder.append(stack.top()).append("\n");
                    break;
            }
        }
        System.out.println(stringBuilder);
    }

}


class MyStack {

    ArrayList<Integer> stack = new ArrayList<>();

    public void pushX(int x) {
        stack.add(x);
    }

    public int pop() {
        if (stack.isEmpty()) {
            return -1;
        }
        return stack.remove(stack.size() - 1);
    }

    public int size() {
        return stack.size();
    }

    public int empty() {
        if (stack.isEmpty()) {
            return 1;
        }
        return 0;
    }

    public int top() {
        if (stack.isEmpty()) {
            return -1;
        }
        return stack.get(stack.size() - 1);
    }

}