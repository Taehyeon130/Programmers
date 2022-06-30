import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] nums) {
          int answer = 0;
        List<Integer>list = Arrays.stream(nums)
                                    .boxed()
                                    .collect(Collectors.toList());
        
        list =  list.stream().distinct().collect(Collectors.toList());
        System.out.println(list);
        
        //list의 사이즈가 포켓몬 종류
        //nums.length/2가 가져갈 수 있는 포켓몬 수
        
        
        if(nums.length/2 >list.size()){ //포켓몬 종류가 3마린데 2개밖에 못가져갈때
            answer = list.size();
        }else{
            answer= nums.length/2;
        }
       
        return answer;
    }
}