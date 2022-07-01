import java.util.HashMap;
import java.util.Map.Entry;


class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        //String에는 참가자들의 이름을 Integer에는 participant의 사람 중에서 completion에 없는 사람들여부
        HashMap<String,Integer> player = new HashMap<>();
        
        //반복문을 돌면서 participant의 각 요소를 p로 받아
        //put을 이용해서 map인 player에 값을 넣는데
        //String에는 p
        //Integer에는 getOrDefault를 이용해서 p가 있다면 p에 매핑되어있는 값을 없다면 0을 넣어주는데 여기에 +1을 해준다.
        for(String p : participant) player.put(p, player.getOrDefault(p,0)+1);
        
        //completion의 각 요소를 p로 받아서 
        //player에 put을 통해 값을 넣는데
        //get을 이용해서 c가 있는 곳의 값을 가져오고 -1을 해줘
        //그러면 participant에 원래 다 1이었는데
        //completion에 있는 사람들은 0이 될꺼야 
        for(String c : completion) player.put(c,player.get(c)-1);
        
        //그럼 이제 값이 1인 선수를 데려오면 돼
        for(String key : player.keySet()){
            if(player.get(key) != 0){
                answer = key;
            }
        }

        
        return answer;
    }
}