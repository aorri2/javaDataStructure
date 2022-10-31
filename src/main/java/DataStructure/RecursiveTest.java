package DataStructure;

public class RecursiveTest {
    public static void main(String[] args) {
        RecursiveTest test = new RecursiveTest();
        test.recur(5);
    }
    public void recur(int n){
        IntStack stack = new IntStack(n);

        while(true){
            if(n > 0){
                stack.push(n);
                n = n-1;
                continue;
            }
            if(!stack.isEmpty()){
                n = stack.pop();
                System.out.println(n);
                n= n-2;
                continue;
            }
            break;
        }
    }
}
