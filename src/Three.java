import java.io.BufferedReader;
import java.io.FileReader;


public class Three {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("three.in"));
            String linea;
            while ((linea = br.readLine()) != null) {
                String numerosString[] = linea.split(" ");
                int i = Integer.parseInt(numerosString[0]);
                int j = Integer.parseInt(numerosString[1]);

                int biggest = 0;
                for (int x = i; x <= j; x++) {
                    int cycle = ciclo(x);
                    if (cycle > biggest) {
                        biggest = cycle;
                    }
                }

                System.out.println(i + " " + j + " " + biggest);

            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int ciclo(int n) {

        int cycle = 1;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;

            } else {
                n = (n * 3) + 1;

            }
            cycle++;
        }

        return cycle;
    }
}
