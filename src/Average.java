import java.io.BufferedReader;
import java.io.FileReader;

public class Average {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("average.in"));
            String linea;

            while ((linea = br.readLine()) != null) {
                String numerosString[] = linea.split(" ");

                int suma = 0;
                for (int i = 0; i < numerosString.length; i++) {
                    suma += Integer.parseInt(numerosString[i]);
                }

                System.out.println((suma / numerosString.length));


            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
