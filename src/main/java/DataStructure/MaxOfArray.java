package DataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class MaxOfArray {


    public static void main(String[] args) {

        MaxOfArray sample = new MaxOfArray();
        System.out.println("키의 최댓값 구하기");
        System.out.print("사람 수 : ");
        Scanner sc = new Scanner(System.in);
        int numberOfPeople = sc.nextInt();
        int[] heightList = new int[numberOfPeople];
        for (int i = 0; i < heightList.length; i++) {
            System.out.println("height[" + i + "]:");
            heightList[i] = sc.nextInt();
        }

        System.out.println(sample.maxOf(heightList));

    }

    public int maxOf(int[] a) {
        int result = Arrays.stream(a).max().getAsInt();
        return result;
    }

}
