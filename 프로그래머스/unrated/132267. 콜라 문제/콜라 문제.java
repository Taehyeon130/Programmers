import java.util.*;

class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n >= a){
            
            int c = n/a; //몇개 보내는지
             
            n = n%a; //몇개 남았는지
            n += c*b;
            answer += c*b; 
        }

        return answer;
    }
}