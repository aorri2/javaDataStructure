package DataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearch binarySearch = new BinarySearch();
        System.out.print("요솟수: ");
        int num = sc.nextInt();
        int[] x = new int[num];

        System.out.print("x[0] : ");
        x[0] = sc.nextInt();

        for (int i = 1; i < num; i++) {
            do{
            System.out.println("x[" + i + "]:");
            x[i] = sc.nextInt();
            }while (x[i] < x[i-1]);
        }

        System.out.print("검색할 값:");
        int key = sc.nextInt();

//        int foundIndex = binarySearch.binarySearch(x, num, key);
        int searchedIndex = Arrays.binarySearch(x, key);
        System.out.println(key + "는 " + searchedIndex+ "위치에 있습니다.");
    }
    private int binarySearch(int[] a, int n, int key){
        int pl = 0;
        int pr = n-1;

        do{
            int pc = (pl+pr)/2;
            if(a[pc] == key){
                return key;
            }else if(a[pc]<key){
                pl = pc + 1;
            }
            else
                pr = pc -1;
        }while (pl <= pr);
        return -1;
    }

}
