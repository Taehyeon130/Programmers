import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String,HashSet<String>> reportMap = new HashMap<>(); 
        Map<String,Integer> idxMap = new HashMap<>();
        
        for(int i=0;i<id_list.length;i++){
            reportMap.put(id_list[i],new HashSet<>());    
            idxMap.put(id_list[i],i);
        }
        
        for(String s:report){
            String[] str = s.split(" ");
            String from = str[0];
            String to = str[1];
            reportMap.get(to).add(from);
        }

        for (int i = 0; i < id_list.length; i++) {
            HashSet<String> send = reportMap.get(id_list[i]);
            if (send.size() >= k) {
                for (String name : send) {
                    answer[idxMap.get(name)]++;
                }
            }
        }        
        return answer;
    }
}
