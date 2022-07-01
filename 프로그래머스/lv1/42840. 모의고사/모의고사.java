import java.util.*;

class Solution { //answers의 길이만큼 나머지 1,2,3의 크기가 달라져야지
    public int[] solution(int[] answers) {
        int[] answer = {}; 
        
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        
        int aCnt=0;
        int bCnt=0;
        int cCnt=0;
        
        for(int i=0;i<answers.length;i++){
            if(a[i%a.length] == answers[i]) aCnt++;
            if(b[i%b.length] == answers[i]) bCnt++;
            if(c[i%c.length] == answers[i]) cCnt++;
        }
        
        int  max = Math.max(aCnt,Math.max(bCnt,cCnt));
        
        ArrayList<Integer> list = new ArrayList<>();
        if(max == aCnt){list.add(1);}
        if(max == bCnt){list.add(2);}
        if(max == cCnt){list.add(3);}

        answer = list.stream().mapToInt(i-> i.intValue()).toArray();
   
        return answer;
    }
}