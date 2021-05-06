/*
class numerosPrimosEratostostenes {

    public static void cribadeEratostenes(int n) {
        // Crea una matriz booleana "primo" e inicializa todas las entradas como true.
        // Un valor en primo será finalmente false si i no es un primo (si no es verdadero).
        boolean[] primo;
        //primo = new boolean[];
        for (int i = 0; i < n; i++)
         //   primo[i] = true;
        for (int p = 2; p * p <= n; p++) {
            // Si el primo no cambia, entonces es primo
        //    if (primo[p] == true) {
                // Actualiza todos los múltiplos de p
                for (int i = p * 2; i <= n; i += p)
            //        primo[i] = false;
            }
        }
        // Imprimie todos los números primos
        for (int i = 2; i <= n; i++) {
            if (primo == true)
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int n = 30;
        System.out.print("Los siguientes son los números primos ");
        System.out.println("menores o igual que " + n);

        cribadeEratostenes(n);
    }
}*/