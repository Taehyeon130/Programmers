import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int [targets.length];
        Map<String,Integer> minMap = new HashMap<>(); // keymap에서 문자 추출하고 
        
        for(int i=0;i<keymap.length;i++){
           for(int j=0;j<keymap[i].length();j++){
               if(minMap.containsKey(keymap[i].substring(j,j+1)) &&  minMap.get(keymap[i].substring(j,j+1)) > j+1){ //값이 있고, 원래 있던게 더 크면
                   minMap.put(keymap[i].substring(j,j+1),j+1);    
               }else if(minMap.containsKey(keymap[i].substring(j,j+1)) &&  minMap.get(keymap[i].substring(j,j+1)) < j+1){
                   //minMap.put(keymap[i].substring(j,j+1),j+1);    
               }else{
                   minMap.put(keymap[i].substring(j,j+1),j+1);    
               }
               
            }   
        }    
         
        for(int i=0;i<targets.length;i++){
            for(int j=0;j<targets[i].length();j++){
               // System.out.println("minMap.get(targets[i].substring(j,j+1)) >>>> " + minMap.get(targets[i].substring(j,j+1)));
                if(minMap.get(targets[i].substring(j,j+1)) != null){
                    answer[i] += minMap.get(targets[i].substring(j,j+1));          
                }else{
                    answer[i] = -1;
                    break;
                }   
            }   
        }
        return answer;
    }
}