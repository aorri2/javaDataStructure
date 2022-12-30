package twopointer;

import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Problem04 s = new Problem04();
        Scanner sc = new Scanner(System.in);
        /**
         * int n : 배열의 크기
         */
        int n = sc.nextInt();
        /**
         * int m : 찾으려는 수의 합
         */
        int m = sc.nextInt();
        int[] arr = new int[n];

        System.out.println(s.solution(n, m, arr));

    }

    private int solution(int n, int m, int[] arr) {
        int answer = 0, sum=0;
        int lt=0;
        for (int rt = 0; rt < n; rt++) {
            sum+=arr[rt];
            if(sum==m) answer++;
            while(sum>=m){
                sum-=arr[lt++];
                if(sum == m) answer++;
            }
        }
        return answer;

    }
}
