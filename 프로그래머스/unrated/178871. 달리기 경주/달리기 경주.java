import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> rankMap = new HashMap<>();
        for(int i=0;i<players.length;i++){
            rankMap.put(players[i],i);
        }
        
        for(String player : callings){
            int rank = rankMap.get(player); //등수
            
            String beforePlayer = players[rank-1];
            
            players[rank-1] = player;
            players[rank] = beforePlayer;
            
            rankMap.put(player,rank-1);
            rankMap.put(beforePlayer, rank);

        }
        
        return players;
    }
}