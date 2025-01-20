import java.util.*;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,String> h1 = new HashMap<String,String>();
        
        //카드의 개수
        String N = br.readLine();
    
        for(int i=0;i< Integer.parseInt(N);i++){
            String[] S = br.readLine().split(" ");
            
                //해시맵에 포함되어있다면
                if(h1.containsKey(S[0])){
                    int n = Integer.parseInt(h1.get(S[0]));
                    int s = Integer.parseInt(S[1]) + n;
                    h1.put(S[0],Integer.toString(s));
                }else{
                    h1.put(S[0],S[1]);
                }
            
        }

        String answer = "";
        for (String key: h1.keySet()) {
			String value = h1.get(key);
            if(value.equals("5")){
                answer = "YES";
               break;
            }else{
                answer = "NO";
            }
		}

        System.out.println(answer);
    }
}