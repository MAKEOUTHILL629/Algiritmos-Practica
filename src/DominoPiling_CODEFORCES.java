import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Link https://codeforces.com/problemset/problem/50/A

public class DominoPiling_CODEFORCES {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] MandN = br.readLine().split(" ");
            System.out.println(( (Integer.parseInt(MandN[0]) *  Integer.parseInt(MandN[1]))/2 ));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
