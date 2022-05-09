class Solution {
    public String solution(String phone_number) {
        String last = phone_number.substring(phone_number.length()-4,phone_number.length()); 
        
        String mid = phone_number.substring(0,phone_number.length()-4);
        String ch = "";
        
        for(int i=0;i<mid.length();i++){
            ch += "*"; 
        }
        
        //String answer = ch + last;
        return ch + last;
    }
}