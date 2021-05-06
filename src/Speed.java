import java.io.BufferedReader;
import java.io.FileReader;

public class Speed {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("speed.in"));
            String linea;
            while (!(linea = br.readLine()).equals("-1")) {
                int n = Integer.parseInt(linea);
                int suma = 0;
                int anteriorTiempo = 0;
                for (int i = 1; i <= n; i++) {
                    String[] numerosString = br.readLine().split(" ");
                    suma += (Integer.parseInt(numerosString[1]) - anteriorTiempo) * Integer.parseInt(numerosString[0]);
                    anteriorTiempo = Integer.parseInt(numerosString[1]);

                }

                System.out.println(suma + " miles");

            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
