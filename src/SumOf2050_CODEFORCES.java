import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOf2050_CODEFORCES {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int t = Integer.parseInt(br.readLine());
            for(int i=0; i<t;i++){
                long n = Long.parseLong(br.readLine());
                System.out.println(sumNumbers(n));
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static long ciclosPotencia(long aux, long number ){

        for(int i =0; i<18 ;i++){
            if((aux + (2050 * Math.pow(10,i+1)) ) <= number){
                continue;
            }else{

                return  aux += 2050 * Math.pow(10,i);



            }
        }

        return 0;
    }

    public static int sumNumbers(long number){


        int iteraciones =0;
        if(number%2050 != 0){
            return iteraciones = -1;
        }else{
            long aux=0;

            while(aux < number){

                aux = ciclosPotencia(aux,number);


                iteraciones++;


            }
            if(aux-number >1000){
                iteraciones--;
            }


        }

        return iteraciones;
    }
}
