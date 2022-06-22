class Solution {
    public String solution(String s) {
        
        String[] a = s.split("\\s",-1); //공백 기준으로 split해서 배열에
        String[] c ={};
        StringBuffer b = new StringBuffer();
        for(int i=0;i<a.length;i++){
            c = a[i].split("");       
            
            for(int j=0;j<c.length;j++){
                if(j%2==0 || j==0){
                    b.append(c[j].toUpperCase());
                }else{
                    b.append(c[j].toLowerCase());
                }                  
            }
            if(i<a.length-1){
                b.append(" ");                    
            }

        }
         
       
        
        String answer = String.valueOf(b);
        return answer;
    }
}