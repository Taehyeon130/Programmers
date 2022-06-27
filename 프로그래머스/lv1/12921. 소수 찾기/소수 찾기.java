class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int[] arr = new int[n+1];
        
        for(int i=0;i<=n;i++){ //먼저 배열에 담아 
            arr[i] = i;
        }
        arr[1] = 0;
        for(int i=2;i<=n;i++){
            if(arr[i]==0)continue; //0이라면 반복문의 처음으로 이동하는것
            
            for(int j=i*2; j<=n; j+=i){ //배수들은 소수가 아니다.
                arr[j] = 0;     
            }
        }
        
        for(int i=0;i<arr.length;i++){
                if(arr[i] != 0){
                    answer++;
                }
            }
        
        
        return answer;
    }
}