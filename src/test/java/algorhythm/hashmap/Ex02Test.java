package algorhythm.hashmap;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;


class Ex02Test {
    @Test
    void hashmapSizeTest() {
        Map<String,Integer> map = new HashMap();
        map.put("1",2);
        map.put("2",2);
        map.put("3",2);
        map.put("4",2);
        int size = map.size();

        Integer value = map.getOrDefault("2", 0);
        Integer aDefault = map.getOrDefault("5", 0);

        Assertions.assertEquals(4,size);
        Assertions.assertEquals(2,value);
        Assertions.assertEquals(1,aDefault);
    }
}