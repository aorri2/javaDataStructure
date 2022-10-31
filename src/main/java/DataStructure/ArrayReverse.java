package DataStructure;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        ArrayReverse arrayReverse = new ArrayReverse();
        arrayReverse.reverse(array);
    }

    public int[] reverse(int[] array){
        int[] result = {  };
        for(int i=0; i<array.length/2;i++){
            int temp[] = {};
            array[i] = temp[i];
            array[i]=array[array.length-1];
            array[array.length-1]=temp[i];
        }
        result = array;

        //0번 인덱스의 위치와 마지막번 인덱스의 위치를 바꾼다.
        return result;
    }
}
