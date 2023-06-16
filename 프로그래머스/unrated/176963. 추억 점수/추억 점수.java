import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String,Integer> map = new HashMap<>();

        int[] answer = new int [photo.length];
        
        for(int i=0;i<name.length;i++){
            map.put(name[i],yearning[i]);
        }
        
        for(int i=0;i<photo.length;i++){
            int sum = 0;
            for(int j=0;j<photo[i].length;j++){
               //System.out.println("photo[i][j] >>> " + photo[i][j]); 

                if(map.get(photo[i][j]) != null){
                   // System.out.println("null 이 아님");
                   // System.out.println("name : yearning " + photo[i][j] + " " + map.get(photo[i][j]));
                    sum +=  map.get(photo[i][j]);
                }
              
            }
            answer[i] = sum;    
            
           
        }
      
        
        return answer;
    }
}