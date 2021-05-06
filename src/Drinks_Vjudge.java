import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Drinks_Vjudge {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int n = Integer.parseInt(br.readLine());
            String[] volumenFraccion = br.readLine().split(" ");
            double fraction = 0;
            for(int i=0; i< volumenFraccion.length; i++){
                fraction += Integer.parseInt(volumenFraccion[i]);

            }
            fraction /= n;
            System.out.println(fraction);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
