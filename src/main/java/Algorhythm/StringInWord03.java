package Algorhythm;

import java.util.Scanner;

public class StringInWord03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringInWord03 sample = new StringInWord03();

        System.out.println(sample.solution(str));
    }
    public String solution(String str){
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] strArray = str.split(" ");
        for (String s : strArray) {
            int length = s.length();
            if(length > m){
                m = length;
                answer = s;
            }
        }

        return answer;
    }

    public String solution2(String str){
        String answer = "";
        int m = Integer.MIN_VALUE, pos;
        while((pos=str.indexOf(' '))!=-1){
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(len>m){
                m = len;
                answer=tmp;
            }
            str = str.substring(pos + 1);
        }
        if(str.length() > m)
            answer = str;
        return answer;
    }
}
