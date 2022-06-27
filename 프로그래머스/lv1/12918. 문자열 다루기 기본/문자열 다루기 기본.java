import java.util.regex.Pattern;
import java.util.*;


class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        
        if((s.length() == 4 || s.length() == 6) &&Pattern.matches("^[0-9]*$",s)) {
            answer = true;
        }

        return answer;
    }
}