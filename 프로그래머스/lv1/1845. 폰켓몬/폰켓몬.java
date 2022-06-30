import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        List<Integer>list = Arrays.stream(nums)
                                    .boxed()
                                    .collect(Collectors.toList());
        
        list =  list.stream().distinct().collect(Collectors.toList());
        
        if(nums.length/2 >list.size()){ 
            answer = list.size();
        }else{
            answer= nums.length/2;
        }
       
        return answer;
    }
}