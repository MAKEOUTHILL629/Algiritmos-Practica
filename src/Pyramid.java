import java.io.BufferedReader;
import java.io.FileReader;

public class Pyramid {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("pyramid.in"));
            String linea;
            while (!(linea = br.readLine()).equals("0")) {
                int n = Integer.parseInt(linea);
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(i);
                    }
                    System.out.println();
                }

            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}


