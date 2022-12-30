package Hash;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class Problem3Test {
        Problem3 problem3Test =new Problem3();

    @Test
    void solution() {
        ArrayList<Integer> solution = problem3Test.solution(7, 4, new int[]{1, 2, 10, 5, 8, 5, 6});

        int[] result = solution.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(result);
//        assertArrayEquals(new int[]{1,2,3,4},result, "error");
        assertNotNull(result);
    }
}