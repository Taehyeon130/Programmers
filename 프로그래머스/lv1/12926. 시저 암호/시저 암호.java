import java.util.*;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        Scanner sc = new Scanner(s);

        char[] c = sc.nextLine().toCharArray(); 
        
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
        
        int[] d = new int[c.length];
       
    
        for(int i=0;i<c.length;i++){   
             d[i] = (int)c[i]+n;  
            System.out.println(d[i]);
            
            if(d[i]-n == 32){//공백이라면
               answer+= " "; 
            }else if(90<d[i] && 64<d[i]-n && d[i]-n < 91){//대문자와 소문자 사이의 문자라면 대문자가 나와야하는거야
                System.out.println(d[i]);
                answer += (char)(65+d[i]-91); 
            }else if(d[i]>122){ //소문자 후 라면 -> 소문자가 나와야해
                answer += (char)(97+d[i]-123);
            }
            else{
                answer += (char)(d[i]);    
            }
        }

        return answer;
    }
}