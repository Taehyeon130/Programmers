import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        List<Integer> wlist = new ArrayList<Integer>();
        List<Integer> hlist = new ArrayList<Integer>();
        
        for(int i=0;i<sizes.length;i++){
            int n1 = sizes[i][0];
            int n2 = sizes[i][1];
            
            wlist.add(Math.max(n1,n2));
            hlist.add(Math.min(n1,n2));
        }
        
        wlist.sort(Comparator.naturalOrder());
        hlist.sort(Comparator.naturalOrder());
        
        System.out.println(wlist);
        System.out.println(hlist);
        
        answer = Collections.max(wlist) * Collections.max(hlist);
     
        return answer;
    }
}