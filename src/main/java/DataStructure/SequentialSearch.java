package DataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class SequentialSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SequentialSearch sequentialSearch = new SequentialSearch();
        System.out.print("요솟수: ");
        int num = sc.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "]:");
            x[i] = sc.nextInt();
        }

        System.out.print("검색할 값:");
        int key = sc.nextInt();
        int foundIndex = sequentialSearch.seqSearch2(x, num, key);
        System.out.println(key + "는 " + foundIndex + "위치에 있습니다.");
    }

    private int seqSearch(int a[], int n, int key) {
        int i = 0;
        while (true) {
            if (i == n)
                throw new IllegalArgumentException(key + ": 존재하지 않는 인자입니다.");
            if (a[i] == key) {
                return i;
            }
            i++;
        }
    }

    private int seqSearch2(int a[], int n, int key) {
        for (int i = 0; i < n; i++)
            if (a[i] == key)
                return i;
        throw new IllegalArgumentException(key + ": 존재하지 않는 인자입니다.");
    }

}
