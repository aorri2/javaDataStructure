package DataStructure;

import java.util.Arrays;

public class SortTest {
    static void swap(int[] a, int index1, int index2) {
        int t = a[index1];
        a[index1] = a[index2];
        a[index2] = t;
    }

    static void bubbleSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                if (a[j - 1] > a[j])
                    swap(a, j - 1, j);
            }
        }
    }

    static void bubbleSort2(int[] a, int n) {
        int exchange = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                if (a[j - 1] > a[j])
                    swap(a, j - 1, j);
                    exchange++;

            }
            if(exchange == 0)
                break;
        }
    }
    static void bubbleSort3(int[] a, int n) {
        int k = 0;
        while(k < n - 1){
            int last = n - 1;
            for(int j = n - 1; j >k;j++)
                if(a[j-1] > a[j]){
                    swap(a, j-1,j);
                    last = j;
                }
            k = last;
        }
    }

    static void selectionSort(int[] a, int n){
        for(int i=0; i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++)
                if(a[j]<a[min])
                    min = j;
            swap(a,i,min);
        }
    }

    public static void main(String[] args) {
        int[] testArr = new int[]{15, 721, 453, 44, 53};
        selectionSort(testArr, 5);
        Arrays.stream(testArr).forEach(d -> System.out.println(d));
    }
}
