import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] T = br.readLine().split(" ");
        int N = Integer.parseInt(T[0]);
        int M = Integer.parseInt(T[1]);

        for(int i=0;i<N;i++){
            String S = br.readLine();
            for(int j=1;j<=M;j++){
                System.out.print(S.charAt(M-j));
            }
            System.out.println();
        }
    }
}