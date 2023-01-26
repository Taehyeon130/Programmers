import java.util.*;

class Solution {
    public long solution(String t, String p) {
        int pl = p.length();
        int tl = t.length();
        //long으로 해야함
        long answer = 0;
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