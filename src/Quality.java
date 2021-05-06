import java.io.BufferedReader;
import java.io.FileReader;

public class Quality {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("quality.in"));
            String linea;
            int team = 1;
            while ((linea = br.readLine()) != null) {
                String numerosString[] = linea.split(" ");

                int numeroResuletos = 0;
                long tiempoTotal = 0;

                for (int i = 0; i < 3; i++) {
                    int tiempo = Integer.parseInt(numerosString[i]);
                    int intentos = Integer.parseInt(numerosString[i + 3]);
                    if (tiempo > 0) {
                        numeroResuletos++;
                        if (intentos == 1) {
                            tiempoTotal += tiempo;
                        } else {
                            tiempoTotal += tiempo + ((intentos - 1) * (20 * 60));
                        }
                    }

                }


                System.out.println("team " + team + ": " + numeroResuletos + ", " + tiempoTotal);
                team++;
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
