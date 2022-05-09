class Solution {
    public boolean solution(int x) {
        int r = x;
        
        String n = Integer.toString(x);

        int y = n.length(); 

        int sum = 0;
        
       for(int i = y; y>0 ;y--){
            if(y==1){
                sum += x/10 + x %10;
            }else{
                int z = (int)Math.pow(10,y);
                int j = x/z;
                sum += j;
                x = x - (z*j);
            }           
        }
       
      boolean answer = true;
       if(r%sum != 0){
            answer = false;
        }
        return answer;
    }
}