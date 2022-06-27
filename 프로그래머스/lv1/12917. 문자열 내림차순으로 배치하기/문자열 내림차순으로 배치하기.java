import java.util.*;

class Solution {
    public String solution(String s) {
        String[] c = String.valueOf(s).split("");
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<c.length;i++){
            Arrays.sort(c,Collections.reverseOrder());
            sb.append(c[i]);
        }
                
        String answer = "";
        
        answer = String.valueOf(sb);
        
        
        return answer;
    }
}