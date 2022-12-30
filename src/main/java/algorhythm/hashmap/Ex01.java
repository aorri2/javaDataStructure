package algorhythm.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Ex01 ex01 = new Ex01();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(ex01.solution(n,str));
    }

    public char solution(int n, String s) {
        char answer=' ';
        HashMap<Character,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (Character x : s.toCharArray()) {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() > max){
                max = entry.getValue();
                answer = entry.getKey();
            }
        }

        return answer;
    }
}
