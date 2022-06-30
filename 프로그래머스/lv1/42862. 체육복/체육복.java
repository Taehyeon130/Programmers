import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
    
        int answer = n;
     
        answer = n-lost.length;
        
        //도난당했지만 여분이 있는 경우
        for(int i=0;i<lost.length;i++){
            for(int j=0;j<reserve.length;j++){
                 //System.out.println(lost[i]+"와 "+reserve[j]);
                if(lost[i] == reserve[j]){
                    reserve[j] = -1;
                    lost[i] = -1;
                    answer = answer+1;
                    //도난당했지만 여분이 있는 학생은 빌려줄수 없지만 체육시간에 참여가능하니까 제외
                   System.out.println(lost[i]+"와 "+reserve[j]);
                }                
            }
        }
        
        //reserve에 있는 학생들의 앞뒤번호 학생이 lost에 있다면
        for(int i=0;i<lost.length;i++){
            for(int j=0;j<reserve.length;j++){
                if(lost[i] != -1 && reserve[j] !=-1){
                    if(lost[i] == reserve[j]-1 || lost[i] == reserve[j]+1){
                        System.out.println(lost[i]+"가 "+reserve[j]+"꺼를 빌려");
                        lost[i] = -1;
                        reserve[j] = -1;
                        
                        answer +=1;
                    }    
                }
                
            }
        }
        
        
        
        return answer;
    }
}