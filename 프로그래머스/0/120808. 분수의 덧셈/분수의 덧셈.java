import java.util.*;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
      
        
        int m = denom1*denom2; //분모
        int j = numer1*denom2 + numer2*denom1; //분자 합
        
        int c = 0;
        
        for(int i=1; i<=m && i<=j; i++){
            if(m%i == 0 && j%i == 0){
                c = i;
            }
        }
        
        m = m/c;
        j = j/c;
        
        int[] answer = {j,m};
        return answer;
    }
}