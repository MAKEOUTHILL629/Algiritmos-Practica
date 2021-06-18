import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class HelpfulMaths {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int numeros[] = Stream.of(br.readLine().split("\\+")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(numeros);
            for(int i=0; i< numeros.length ;i++){
                System.out.print((i == numeros.length-1) ? numeros[i] : numeros[i] +"+");
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
