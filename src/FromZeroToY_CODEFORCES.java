import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Link https://codeforces.com/problemset/problem/1488/A
public class FromZeroToY_CODEFORCES {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {

                String[] numerosString = br.readLine().split(" ");

                System.out.println(numeroTest(Integer.parseInt(numerosString[0]), Integer.parseInt(numerosString[1])));

            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static int numeroPotencia(int x, int y, int k) {


        for (int i = 0; i < 9; i++) {

            if (y >= (k + (x * Math.pow(10, i + 1)))) {
                continue;
            } else {
                return i;

            }
        }

        return 0;
    }

    public static int numeroTest(int x, int y) {

        int k = 0;
        int numeroCasos = 0;


        while (k < y) {
            if ((k + x) <= y) {

                k += x * Math.pow(10, numeroPotencia(x, y, k));
            } else {
                k++;

            }
            numeroCasos++;


        }

        return numeroCasos;
    }
}
