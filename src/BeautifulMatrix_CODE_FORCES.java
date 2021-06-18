import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Link https://codeforces.com/problemset/problem/263/A
public class BeautifulMatrix_CODE_FORCES {

    public static void main(String args[]) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[][] matriz = new String[5][5];
            for (int i = 0; i < 5; i++) {
                String[] vectorMatriz = br.readLine().split(" ");

                matriz[i] = vectorMatriz;
            }

            System.out.println(minPosition(matriz));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static int minPosition(String[][] matriz) {
        int indexI = 0, indexJ = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j].equals("1")) {
                    indexI = i;
                    indexJ = j;

                }
            }
        }
        if(indexI == 2 && indexJ == 2){
            return 0;
        }else{
            int auxI = indexI;
            int auxJ = indexJ;
            int contador =0;

            while(auxI != 2){
                contador++;
                if(auxI < 2){
                    auxI++;
                }else{
                    auxI--;
                }
            }

            while(auxJ != 2){
                contador++;
                if(auxJ < 2){
                    auxJ++;
                }else{
                    auxJ--;
                }
            }
            return contador;
        }




    }
}

