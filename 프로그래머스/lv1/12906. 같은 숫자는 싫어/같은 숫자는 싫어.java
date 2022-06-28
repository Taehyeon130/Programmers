import java.util.*;
import java.util.stream.Collectors;


public class Solution {
    public int[] solution(int []arr) {
                
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1]){     
                arr[i] = -1;
            }
        }
        
        //리스트를 배열로
        int[] answer = Arrays.stream(arr)
                            .filter(i -> i != -1)
                            .toArray();

        return answer;
    }
}