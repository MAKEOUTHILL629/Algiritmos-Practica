import java.io.BufferedReader;

import java.io.FileReader;


public class Perfect {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("perfect.in"));
            String linea;
            while ((linea = br.readLine()) != null) {
                int n = Integer.parseInt(linea);
                int suma = 0;
                for (int i = 1; i < n; i++) {
                    if (n % i == 0) {
                        suma += i;
                    }
                }
                if (suma == n) {
                    System.out.println("Perfect Number");
                } else {
                    System.out.println("No Perfect Number");
                }

            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
