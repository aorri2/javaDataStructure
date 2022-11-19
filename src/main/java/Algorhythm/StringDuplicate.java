package Algorhythm;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class StringDuplicate {
    public String solution(String str){
        String answer="";
        char[] chars = str.toCharArray();
        Set<Character> strSet = new LinkedHashSet<>();
        for (char ch : chars) {
            strSet.add(ch);
        }
        answer = strSet.toString();
        return answer;
    }

    public static void main(String[] args) {
        StringDuplicate sample = new StringDuplicate();
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();
        System.out.println(sample.solution(inputStr));
    }
}
