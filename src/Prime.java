import java.io.BufferedReader;
import java.io.FileReader;

public class Prime {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("prime.in"));
            String linea;
            while ((linea = br.readLine()) != null) {
                String numerosString[] = linea.split(" ");
                int biggest = 0;

                for (int i = 0; i < numerosString.length; i++) {
                    int n = Integer.parseInt(numerosString[i]);
                    if (esPrimo(n)) {
                        if (n > biggest) {
                            biggest = n;
                        }
                    }
                }
                if (biggest == 0) {
                    System.out.println("No");
                } else {
                    System.out.println(biggest);
                }


            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean esPrimo(int numero) {

        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {

            if (numero % x == 0)
                return false;
        }

        return true;
    }

}
