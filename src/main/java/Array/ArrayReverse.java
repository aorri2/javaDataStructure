package Array;

import java.util.Arrays;

public class ArrayReverse {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int lt=0, rt=num_list.length-1;
        while(lt<=rt){
            int temp=0;
            temp = num_list[lt];
            num_list[lt] = num_list[rt];
            num_list[rt] = temp;
            lt++;
            rt--;
        }
        answer = num_list;
        return answer;
    }

    public static void main(String[] args) {
        ArrayReverse arrayReverse = new ArrayReverse();
        int[] solution = arrayReverse.solution(new int[]{1, 2, 3, 4, 5, 6});
        Arrays.stream(solution).forEach(System.out::println);
    }
}
