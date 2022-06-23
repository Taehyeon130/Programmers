class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        char[] c = s.toCharArray();  
        int[] d = new int[c.length];
       
        for(int i=0;i<c.length;i++){   
             d[i] = (int)c[i]+n;  
            
            if(d[i]-n == 32){//공백이라면
               answer+= " "; 
            }else if(90<d[i] && 64<d[i]-n && d[i]-n < 91){
                answer += (char)(65+d[i]-91); 
            }else if(d[i]>122){
                answer += (char)(97+d[i]-123);
            }
            else{
                answer += (char)(d[i]);    
            }
        }
        return answer;
    }
}