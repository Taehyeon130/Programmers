import java.util.Arrays;
import java.util.Collections;

class Solution {
    public Long solution(long n) {
        String a = String.valueOf(n); //long -> String
        
        String [] b = a.split(""); // 배열형태로
      
        Arrays.sort(b, Collections.reverseOrder()); //내림차순
        
        Long answer = Long.parseLong(String.join("",b));

        return answer;
    }
}