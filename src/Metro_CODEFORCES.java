import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Link ejercicio https://codeforces.com/problemset/problem/1055/A
public class Metro_CODEFORCES {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {

            String[] NandS = br.readLine().split(" ");
            String[] trackUno = br.readLine().split(" ");
            String[] trackDos = br.readLine().split(" ");

            if (bobTravel(Integer.parseInt(NandS[1]), trackUno, trackDos)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean bobTravel(int s, String[] trackUno, String[] trackDos) {

        if (Integer.parseInt(trackUno[0]) == 0) {
            return false;
        } else if (Integer.parseInt(trackUno[s - 1]) == 1) {
            return true;
        } else {

            for (int i = s; i < trackUno.length; i++) {

                if (Integer.parseInt(trackUno[i]) == 1 && Integer.parseInt(trackDos[i]) == 1 && Integer.parseInt(trackDos[s - 1]) == 1) {

                    return true;
                }
            }


            return false;
        }


    }

}
