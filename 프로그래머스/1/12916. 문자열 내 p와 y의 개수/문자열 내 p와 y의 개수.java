class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        String[] c = String.valueOf(s).split("");
        int p =0;
        int y = 0;
        for(int i=0;i<c.length;i++){
            if(c[i].equalsIgnoreCase("p")){
                p +=1;
            }else if(c[i].equalsIgnoreCase("y")){
                y +=1;
            }
        }
        
        if(p!=y){
            answer=false;
        }

        return answer;
    }
}