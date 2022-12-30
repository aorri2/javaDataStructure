package programmers.lv1;

public class AddNumberIndex {
    public int solution(int n) {
        int answer =0;

        while(n>0){
            answer += n%10;
            System.out.println("answer: "+answer);
            n /= 10;
            System.out.println("n: "+n);
        }

        return answer;
    }

    public static void main(String[] args) {
        AddNumberIndex a =new AddNumberIndex();
        a.solution(987);
    }
}
