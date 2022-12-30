package programmers.lv1;

import java.util.HashMap;
import java.util.Map;

public class Completion {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        for (String player : participant) {
            map.put(player,map.getOrDefault(player,0)+1);
        }
        for (String completionPlayer : completion) {
            map.put(completionPlayer, map.get(completionPlayer)-1);
        }
        for (String key : map.keySet()) {
            Integer count = map.get(key);
            if(count != 0){
                answer = key;
            }
        }
        return answer;
    }
}
