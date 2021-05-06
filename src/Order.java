import java.io.BufferedReader;
import java.io.FileReader;

public class Order {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("order.in"));
            String linea;

            int iteracion = 1;
            while (!(linea = br.readLine()).equals("0")) {

                int n = Integer.parseInt(linea);
                int indicePrincipio = 0, indiceUltimo = (n - 1);
                String[] arrayNombres = new String[n];


                for (int i = 0; i < n; i++) {
                    String nombre = br.readLine();
                    if (i % 2 == 0) {
                        arrayNombres[indicePrincipio] = nombre;
                        indicePrincipio++;
                    } else {
                        arrayNombres[indiceUltimo] = nombre;
                        indiceUltimo--;
                    }
                }

                System.out.println("SET " + iteracion);
                iteracion++;
                for (String nombre : arrayNombres) {
                    System.out.println(nombre);
                }

            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
