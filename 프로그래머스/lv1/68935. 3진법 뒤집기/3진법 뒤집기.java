

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder();
        
        while (n >= 3){
            sb.append(n%3);
            n = n/3;
        }        
        sb.append(n%3);

        String s = sb.toString();
        String[] x = s.split("");
        int j = 1;
        
        for(int i=x.length-1;i>-1;i--){
            int m = Integer.parseInt(x[i]);
            answer = answer + m*j;
               j = j*3;
        }

        return answer;
    }
}