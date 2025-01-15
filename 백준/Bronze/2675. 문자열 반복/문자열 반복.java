import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;

        int testCase = Integer.parseInt(br.readLine());
        
        for(int i=0;i<testCase;i++){
            String tc = br.readLine();
            String[] tcc = tc.split(" ");
            int banbok = Integer.parseInt(tcc[0]);
            String ss = tcc[1];
            
            for(int j=0;j<ss.length();j++) {
                for(int k=0;k<banbok;k++){
                    System.out.print(ss.charAt(j));        
                }
            }
            System.out.println();
        }
	}
}