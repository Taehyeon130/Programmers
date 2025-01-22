import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringTokenizer st2;
        
        //재료의 갯수
        int N = Integer.parseInt(br.readLine());
int useM = N-1;
        HashMap<String,Integer> map = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        
        while(N-- >0){
            String m = st.nextToken();
            map.put(m,0);
        }

        
        st2 = new StringTokenizer(br.readLine());
        
        while(useM-- > 0){
           String usedM = st2.nextToken();
           if(map.containsKey(usedM)){
               map.put(usedM,1);
           }
        }

        for(String key : map.keySet()){
           if(map.get(key) == 0){
                System.out.println(key);
            }
        }

       
    }
}