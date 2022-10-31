package DataStructure;

import java.util.Scanner;

public class IntQueueRunner {
    public static void main(String[] args) {
        IntQueue queue = new IntQueue(64);
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("현재 데이터 수 :"+queue.size()+"/"+queue.capacity());
            System.out.print("(1) 인큐 (2) 디큐 (3)피크"+"(4)덤프 (0) 종료");
            int menu = sc.nextInt();
            if(menu == 0)
                break;
            int data;
            switch (menu){
                case 1:
                    System.out.print("데이터 : ");
                    data = sc.nextInt();
                    try{
                        queue.enque(data);
                    }catch (IntStack.OverflowIntStackException e){
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;

                case 2:
                    try{
                       int poppedData = queue.deque();
                        System.out.println("디큐한 데이터는"+poppedData+"입니다.");
                    }catch (IntStack.EmptyIntStackException e){
                        System.out.println("스택이 비어 있습니다");
                    }
                    break;
                case 3:
                    try{
                        int peekedData = queue.peek();
                        System.out.println("Peek한 데이터는"+peekedData+"입니다.");
                    }catch (IntStack.EmptyIntStackException e){
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;
                case 4:
                    queue.dump();
                    break;
            }
        }
    }
}
