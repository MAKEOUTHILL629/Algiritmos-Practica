import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Word_Vjudge {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String palabra = br.readLine();
            int cantidadMayusculas = 0;
            int cantidadMinusculas = 0;
            for (int i = 0; i < palabra.length(); i++) {

                if (Character.isUpperCase(palabra.charAt(i))) {
                    cantidadMayusculas++;
                } else {
                    cantidadMinusculas++;
                }
            }

            if (cantidadMayusculas > cantidadMinusculas) {
                System.out.println(palabra.toUpperCase());
            } else {
                System.out.println(palabra.toLowerCase());
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
