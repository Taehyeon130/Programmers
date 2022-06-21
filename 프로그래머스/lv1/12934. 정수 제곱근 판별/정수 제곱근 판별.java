class Solution {
    public long solution(long n) {
        long answer = 0;
        
        double x = Math.sqrt(n); //제곱근
        
        if(n == (long) Math.pow(x,2) && n%Math.sqrt(n) ==0){
            answer = (long) Math.pow(x+1,2);
        }else{
            answer = -1;
            
            
        }
        
        return answer;
    }
}