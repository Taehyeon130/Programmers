class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if(a>b){
            for(;b<=a;b++){
                answer+=b;
            }
        }else if(a<b){
            for(;a<=b;a++){
                answer +=a;
            }
        }else {
            answer= a;
        }
        
        return answer;
    }
}