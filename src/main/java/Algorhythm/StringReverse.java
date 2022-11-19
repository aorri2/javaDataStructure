package Algorhythm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] inputStr = new String[size];
        for (int i = 0; i < size; i++) {
            inputStr[i] = sc.next();
        }
        StringReverse sample = new StringReverse();
        List<String> solution = sample.solution(inputStr);
        for (String s : solution) {
            System.out.println(s);
        }
    }

    public List<String> solution(String[] strArray){
        List<String> answer = new ArrayList<>();
        for (String str : strArray) {
            int length = str.length();
            char[] chars = str.toCharArray();
            int left = 0;
            int right = length-1;
            while(left < right){
                char tmp = chars[left];
                chars[left] = chars[right];
                chars[right] = tmp;
                left++;
                right--;
            }
            String tmp = String.valueOf(chars);
            answer.add(tmp);
        }
        return answer;
    }
}
