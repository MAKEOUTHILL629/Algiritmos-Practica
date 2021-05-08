import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//link https://codeforces.com/problemset/problem/282/A

public class BitPlusPlus_CODEFORCES {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());
            int x=0;
            while(--n >=0){
                String sentence = br.readLine();
                if( (sentence.charAt(0) == '-' || sentence.charAt(2) == '-')  &&  sentence.charAt(1) == '-'){
                    x--;
                }else{
                    x++;
                }
            }
            System.out.println(x);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
