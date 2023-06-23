import java.util.*;

class Solution {
    public String solution(String new_id) {
        String answer = "";

        //모든 대문자는 소문자로
        answer = new_id.toLowerCase();

        //소문자, 숫자, 빼기, 밑줄, 마침표 제외 모두 제거
        answer = answer.replaceAll("[^a-z0-9._-]","");

        //마침표 2번이상 반복되면 마침표 하나로 
        answer = answer.replaceAll("\\.{2,}","\\.");

        //마침표가 처음이나 끝이면 제거
       answer = answer.replaceAll("\\.$","");
       answer = answer.replaceAll("^\\.","");

        if(answer.isEmpty()){
            answer = "a";
        }
        
      //16자 이상이면 15개 제외모든 문자 제거, 만약 마침표가 마지막이면 그것도 제거
        if(answer.length() > 15){
           answer =  answer.substring(0,15);
           answer = answer.replaceAll("\\.$","");
        }

    //길이가 1 이하라면 마지막 문자를 길이가 3이 될때까지 반복해서 붙임
     while(answer.length() < 3){
        String la = String.valueOf(answer.charAt(answer.length()-1));
   
            answer += la;
                 
            }
        return answer;
    }
}