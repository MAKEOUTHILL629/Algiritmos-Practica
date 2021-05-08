import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Link https://codeforces.com/problemset/problem/158/A

public class NextRound_CODEFORCES {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] NandK = br.readLine().split(" ");
            int k = Integer.parseInt(NandK[1]);
            String[] participantes = br.readLine().split(" ");
            int contadorMas = 0;
            if(Integer.parseInt(participantes[k-1]) <= 0 ){

                for(int i =0; i< participantes.length;i++){
                    if(Integer.parseInt(participantes[i]) > 0  ){
                        contadorMas++;
                    }else{
                        break;
                    }
                }

                System.out.println(contadorMas);

            }else{


                for(int i=k-1; i < participantes.length-1; i++  ){
                    if(Integer.parseInt(participantes[i+1]) >= Integer.parseInt(participantes[k-1]) ){
                        contadorMas++;
                    }else{

                        break;
                    }
                }

                System.out.println((k+contadorMas));
            }




        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
