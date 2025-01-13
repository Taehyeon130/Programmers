class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        String[] sArr = s.split("");
        int pCnt =0;
        int yCnt = 0;
        
        for(int i=0;i<sArr.length;i++){
            if(sArr[i].equalsIgnoreCase("p")){
                pCnt +=1;
            }else if(sArr[i].equalsIgnoreCase("y")){
                yCnt +=1;
            }
        }
        
        if(pCnt!=yCnt){
            answer=false;
        }

        return answer;
    }
}