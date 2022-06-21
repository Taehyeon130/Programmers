class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {gcd(n,m),lnc(n,m)};
        return answer;
    }
    
    //최대공약수
    public int gcd(int n, int m){
        if(n%m==0){ 
            return m;
        }
        return gcd(m,n%m);
    }
    
    //최소공배수
    public int lnc(int n, int m){
        return n*m/gcd(n,m);
    }
}