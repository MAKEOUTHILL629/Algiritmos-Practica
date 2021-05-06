import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Watermelon_CODEFORCES {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            int w = Integer.parseInt(bf.readLine());
            if (w == 2) {

                System.out.println("NO");
            } else if (w % 2 != 0) {
                System.out.println("NO");

            } else {
                System.out.println("YES");
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
