import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//Link https://codeforces.com/problemset/problem/299/B
public class KsushaTheSquirrel_CODEFORCES {
    public static void main(String[] args) {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] NandK = br.readLine().split(" ");
            String road = br.readLine();

            System.out.println(isJump(road, Integer.parseInt(NandK[1])) ? "YES" : "NO");

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static boolean isJump(String road, int k) {

        if (k >= road.length()) {

            return true;
        } else if (!road.contains(Character.toString('#'))) {

            return true;
        } else {

            for (int i = 0; i < road.length(); i++) {
                if (i == road.length() - 1) {
                    return true;
                } else if (road.charAt(i + 1) == '#') {
                    boolean bandera = false;

                    for (int j = k; j > 0; j--) {
                        if ((i + j) >= road.length() - 1) {
                            return true;
                        } else if (road.charAt(i + j) == '.') {

                            i += (j - 1);
                            bandera = true;
                            break;
                        }
                    }
                    if (!bandera) {

                        return false;
                    }

                }
            }
            return true;
        }


    }

}
