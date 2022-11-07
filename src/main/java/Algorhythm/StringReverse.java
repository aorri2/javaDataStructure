package Algorhythm;

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
        String[] solution = sample.solution(size, inputStr);
        for (String s : solution) {
            System.out.println(s);
        }
    }

    public String[] solution(int size, String[] strArray){
        String[] answer = new String[size];
        int length = strArray.length;
        for (int i = 0; i < length; i++) {
            String str = strArray[i];
            StringBuilder builder = new StringBuilder(str);
            String reversedString = builder.reverse().toString();
            answer[i] = reversedString;
        }
        return answer;
    }
}
