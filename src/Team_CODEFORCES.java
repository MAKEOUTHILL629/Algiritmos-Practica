import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Team_CODEFORCES {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());
            int cantidad =0;
            while(n-- > 0){
                String[] seguraSolucion = br.readLine().split(" ");
                int contador=0;
                for(String friends : seguraSolucion){
                    if(Integer.parseInt(friends) == 1){
                        contador++;
                    }
                }
                if(contador>=2){
                    cantidad++;
                }
            }

            System.out.println(cantidad);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
