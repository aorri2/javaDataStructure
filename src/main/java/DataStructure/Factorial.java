package DataStructure;

public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int result = factorial.factorial(5);
        System.out.println(result);
    }
    public int factorial(int n){
        if(n <= 0)
            return 1;
        else
            return n * factorial(n-1);
    }
}
