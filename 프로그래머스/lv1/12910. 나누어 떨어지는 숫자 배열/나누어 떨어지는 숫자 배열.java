import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % divisor == 0){ 
                list.add(arr[i]);
                n++;
            }
        }
        if(n==0){
                list.add(-1);
        }
                
        int[] answer = list.stream()
                        .mapToInt(Integer :: intValue)
                        .toArray();

        Arrays.sort(answer);
        return answer;
    }
}