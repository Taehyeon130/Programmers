import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);

        //부서가 하나일때 
        if(d.length==1){
            if(d[0]<budget){
                answer = 1;
            }
        }
        
        int index = 0;    
        int sum = 0;
        for(int i=0;i<d.length;i++){
            sum  = sum + d[i];
            System.out.println(i+"일 때"+sum);

            if(sum <= budget){
                index = index +1;
                answer = index;
            }else if(sum > budget){
                answer = index;
            }else if(sum == budget){
                answer = d.length;
            }
        }    
       
        
        return answer;
    }
}