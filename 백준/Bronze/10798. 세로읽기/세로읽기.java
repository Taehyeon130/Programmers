import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int maxLength=0;
        
        String[][] carr = new String[5][15];

        for(int i=0;i<5;i++){
            String[] S = br.readLine().split("");
            
            if(maxLength < S.length){
                maxLength = S.length;
            }
            
           for(int j=0;j<S.length;j++){
               carr[i][j] = S[j];
           }
        }
        

        for(int i=0;i<maxLength;i++){
            for(int j=0;j<5;j++){
                if(carr[j][i] != null){
                    sb.append(carr[j][i]);
                }
                
            }
        }
        
        System.out.print(sb);
    }
}