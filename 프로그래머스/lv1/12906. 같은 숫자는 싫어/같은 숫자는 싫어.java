import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1]){     
                arr[i] = -1;
            }
        }
        
        int[] answer = Arrays.stream(arr)
                            .filter(i -> i != -1)
                            .toArray();

        return answer;
    }
}