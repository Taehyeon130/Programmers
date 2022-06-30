class Solution {
    public int solution(int left, int right) {
        int answer = 0;
         
        while(left <= right){
            System.out.println(left);
            int n=0;
            for(int i=1;i<=left;i++){
                
                if(left%i==0){
                    n++;
                }
            }
            if(n%2==0){
                answer = answer + left;
            }else{
                answer = answer - left;
            }
            System.out.println(left+"일 때"+n);
            left = left+1;    

        }
        
         
        return answer;
    }
}