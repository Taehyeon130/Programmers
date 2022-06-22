import java.util.*;

class Solution {
    public int[] solution(long n) {
        
        String[] a = String.valueOf(n).split("");
        
        int[] answer = new int[a.length];
        
        for(int i = a.length-1;i>-1;i--){
            answer[i] = Integer.parseInt(a[(a.length-1)-i]);
        }
    
        return answer;
    }
}