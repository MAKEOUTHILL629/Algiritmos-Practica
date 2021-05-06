import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Link https://codeforces.com/problemset/problem/299/B
public class KsushaTheSquirrel_CODEFORCES {
    public static void main(String[] args) {
        long tiempoEmpeza = System.currentTimeMillis();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] NandK = br.readLine().split(" ");
            String road = br.readLine();

            Pattern pat =Pattern.compile("#{"+Integer.parseInt(NandK[1])+"}");
            Matcher mat = pat.matcher(road);


            if(!mat.find()){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(System.currentTimeMillis() - tiempoEmpeza);

    }

}
