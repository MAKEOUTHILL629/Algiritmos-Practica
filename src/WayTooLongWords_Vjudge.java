import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WayTooLongWords_Vjudge {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int n = Integer.parseInt(br.readLine());
            for(int i =0; i< n; i++){
                String palabra= br.readLine();
                int longitud = palabra.length();

                if( longitud <= 10){
                    System.out.println(palabra);
                }else{
                    System.out.println(Character.toString(palabra.charAt(0)) + (longitud-2) + Character.toString(palabra.charAt(longitud-1)));

                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
