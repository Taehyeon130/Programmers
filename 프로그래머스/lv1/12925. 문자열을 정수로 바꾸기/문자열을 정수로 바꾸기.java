class Solution {
    public int solution(String s) {
        int answer = 0;
        
        
        StringBuffer sb = new StringBuffer();
        for(char a : s.toCharArray()){
            
            if(a == '-' || a == '+'){
                sb.append(a);
            }else{
                sb.append(a);
            }
        }
        
        answer += Integer.parseInt(String.valueOf(sb));
        
        
        return answer;
    }
}