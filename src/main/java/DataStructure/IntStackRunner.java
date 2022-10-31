package DataStructure;

import java.util.Scanner;

public class IntStackRunner {
    public static void main(String[] args) {
        IntStack stack = new IntStack(64);
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("현재 데이터 수 :"+stack.size()+"/"+stack.capacity());
            System.out.print("(1) 푸시 (2) 팝 (3)피크"+"(4)덤프 (0) 종료");
            int menu = sc.nextInt();
            if(menu == 0)
                break;
            int data;
            switch (menu){
                case 1:
                    System.out.print("데이터 : ");
                    data = sc.nextInt();
                    try{
                        stack.push(data);
                    }catch (IntStack.OverflowIntStackException e){
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;

                case 2:
                    try{
                       int poppedData = stack.pop();
                        System.out.println("팝한 데이터는"+poppedData+"입니다.");
                    }catch (IntStack.EmptyIntStackException e){
                        System.out.println("스택이 비어 있습니다");
                    }
                    break;
                case 3:
                    try{
                        int peekedData = stack.peek();
                        System.out.println("Peek한 데이터는"+peekedData+"입니다.");
                    }catch (IntStack.EmptyIntStackException e){
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;
                case 4:
                    stack.dump();
                    break;
            }
        }
    }
}
