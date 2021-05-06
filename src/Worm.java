import java.io.BufferedReader;
import java.io.FileReader;

public class Worm {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("worm.in"));
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] numerosString = linea.split(" ");
                int meta = Integer.parseInt(numerosString[0]);
                if (meta == 0) {
                    break;
                }
                int subir = Integer.parseInt(numerosString[1]);

                int bajar = Integer.parseInt(numerosString[2]);
                int posicion = 1;
                int tiempo = 0;

                while (posicion < meta) {
                    posicion += subir;
                    tiempo++;

                    tiempo++;
                    posicion -= bajar;


                }

                System.out.println((tiempo - 1));

            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
