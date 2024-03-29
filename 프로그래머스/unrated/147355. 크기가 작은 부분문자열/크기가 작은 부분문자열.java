import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int pl = p.length();
        int tl = t.length();
        
        int answer = 0;
        long cnt = 0;
        
        while(pl+cnt <= tl){
            int startIdx = 0;
                startIdx += cnt;
                String com = t.substring(startIdx,pl+startIdx);
                if(Long.parseLong(com) <= Long.parseLong(p)){
                    answer++;            
                }   
            
            cnt++;
        }
        return answer;
    }
}
