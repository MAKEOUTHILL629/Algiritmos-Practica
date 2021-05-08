import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Link https://codeforces.com/problemset/problem/112/A

public class PetyaAndStrings_CODEFORCES {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {

            System.out.println(compararCadenas(br.readLine().toLowerCase(), br.readLine().toLowerCase()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static int compararCadenas(String cadena1, String cadena2) {


        for (int i = 0; i < cadena1.length(); i++) {
            if (cadena1.charAt(i) > cadena2.charAt(i)) {
                return 1;
            } else if (cadena1.charAt(i) < cadena2.charAt(i)) {
                return -1;
            }
        }

        return 0;

    }
}
