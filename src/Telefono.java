import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class Telefono {

    public static void main(String[] args) {
        long t1= System.currentTimeMillis();
        try {
            BufferedReader br = new BufferedReader(new FileReader("lista.in"));
            String linea;
            int caso = Integer.parseInt(br.readLine());
            while (caso--  > 0) {
               int cantidad = Integer.parseInt(br.readLine());
               String[] numeros = new String[cantidad];
               for(int i=0; i<cantidad; i++){
                   numeros[i]= br.readLine();
               }
                Arrays.sort(numeros);
                if(verificar(numeros)){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }

            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        long t2 =System.currentTimeMillis() - t1;
        System.out.println(t2);

    }

    public static boolean verificar(String[] numeros){
        for(int i=0; i< numeros.length; i++){

            if(numeros[i+1].startsWith(numeros[i])){
                    return false;
                }

        }

        return true;
    }
}
