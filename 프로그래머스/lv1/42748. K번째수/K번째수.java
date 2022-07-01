import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        List<Integer>list = new ArrayList<>(); 
        
        for(int i=0;i<commands.length;i++){
            for(int j=0;j<commands[i].length;j++){
                int[] n = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
                list = Arrays.stream(n).boxed().collect(Collectors.toList());
                list.sort(Comparator.naturalOrder());                
            }
            
            answer[i] = list.get(commands[i][2]-1);
        }
        
        
        
        
        return answer;
    }
}