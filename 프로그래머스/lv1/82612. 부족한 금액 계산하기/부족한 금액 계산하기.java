class Solution {                         
    public long solution(int price, int money, int count) {
        
         long sum =0;
        for (int i=1;i<=count;i++){
            sum += price*i;
        }
        long answer = Math.abs(money-sum);
        
        if(money>sum){
            answer = 0;
        }
        
        return answer;
    }
}