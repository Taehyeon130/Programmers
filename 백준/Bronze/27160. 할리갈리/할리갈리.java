import java.util.*;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Integer> h1 = new HashMap<String,Integer>();
        
        //카드의 개수
        String N = br.readLine();
    
        for(int i=0;i< Integer.parseInt(N);i++){
            String[] S = br.readLine().split(" ");
            
                //해시맵에 포함되어있다면
                if(h1.containsKey(S[0])){
                    int n = h1.get(S[0]);
                    int s = Integer.parseInt(S[1]) + n;
                    h1.put(S[0],s);
                }else{
                    h1.put(S[0],Integer.parseInt(S[1]));
                }
            
        }
       
        if(h1.containsValue(5)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}