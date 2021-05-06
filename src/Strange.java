import java.io.BufferedReader;
import java.io.FileReader;

public class Strange {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("strange.in"));
            String linea;
            while ((linea = br.readLine()) != null) {
                String numerosString[] = linea.split(" ");
                long suma = 0;
                int mayor = 0;
                int menor = 9000000;

                for (int i = 0; i < numerosString.length; i++) {
                    int numero = Integer.parseInt(numerosString[i]);
                    suma += numero;
                    if (numero > mayor) {
                        mayor = numero;
                    }

                    if (numero < menor) {
                        menor = numero;
                    }
                }

                suma += mayor;
                suma += menor;

                System.out.println(suma);

            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
