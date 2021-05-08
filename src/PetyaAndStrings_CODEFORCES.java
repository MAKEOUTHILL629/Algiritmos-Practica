import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PetyaAndStrings_CODEFORCES {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String cadena1 = br.readLine().toLowerCase();
            String cadena2 = br.readLine().toLowerCase();
            int acumulador1 =0;
            int acumulador2 =0;
            for(int i=0; i<cadena1.length(); i++){
                acumulador1 += cadena1.charAt(i);
                acumulador2 += cadena2.charAt(i);
            }

            System.out.println("El tamnio de la cadena1 es " +acumulador1 + " \nel tamanio de la cadena2 es "+ acumulador2);

            if(acumulador1>acumulador2){
                System.out.println(1);
            }else if(acumulador2 > acumulador1){
                System.out.println(-1);
            }else{
                System.out.println(0);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
