import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
//Link ejercicio https://codeforces.com/problemset/problem/1512/B

public class AlmostRectangle_CODEFORCES {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int n = Integer.parseInt(br.readLine());
            for (int x = 0; x < n; x++) {

                int t = Integer.parseInt(br.readLine());
                char[][] matriz = new char[t][t];
                int[] posiciones = new int[4];
                int contador = 0;
                for (int i = 0; i < t; i++) {
                    String linea = br.readLine();

                    for (int j = 0; j < t; j++) {
                        matriz[i][j] = linea.charAt(j);
                        if (linea.charAt(j) == '*') {
                            posiciones[contador] = i;
                            contador++;
                            posiciones[contador] = j;
                            contador++;
                        }
                    }
                }
                if (posiciones[0] == posiciones[2]) {

                    if ((posiciones[0] + 1) < t) {
                        matriz[posiciones[0] + 1][posiciones[1]] = '*';
                        matriz[posiciones[0] + 1][posiciones[3]] = '*';
                    } else {
                        matriz[posiciones[0] - 1][posiciones[1]] = '*';
                        matriz[posiciones[0] - 1][posiciones[3]] = '*';
                    }

                } else if (posiciones[1] == posiciones[3]) {

                    if ((posiciones[1] + 1) < t) {

                        matriz[posiciones[0]][posiciones[1] + 1] = '*';

                        matriz[posiciones[2]][posiciones[1] + 1] = '*';
                    } else {
                        matriz[posiciones[0]][posiciones[1] - 1] = '*';
                        matriz[posiciones[2]][posiciones[1] - 1] = '*';
                    }


                } else {

                    matriz[posiciones[2]][posiciones[1]] = '*';
                    matriz[posiciones[0]][posiciones[3]] = '*';

                }


                for (int i = 0; i < t; i++) {
                    for (int j = 0; j < t; j++) {
                        System.out.print(matriz[i][j]);
                    }
                    System.out.println("");
                }


            }

        } catch (
                IOException e) {
            e.printStackTrace();
        }


    }
}
