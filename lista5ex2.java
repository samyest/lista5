import java.util.Random;

public class lista5ex2 {
   public static void main(String[] args) {
        int[][] M = new int[6][8];
        int[] C = new int[6];
        
        Random random = new Random();

       for (int[] M1 : M) {
           for (int j = 0; j < M1.length; j++) {
               M1[j] = random.nextInt(21) - 10;
           }
       }

        for (int i = 0; i < M.length; i++) {
            int countNegativos = 0;
            for (int j = 0; j < M[i].length; j++) {
                if (M[i][j] < 0) {
                    countNegativos++;
                }
            }
            C[i] = countNegativos;
        }
        System.out.println("Matriz M:");
       for (int[] M1 : M) {
           for (int j = 0; j < M1.length; j++) {
               System.out.print(M1[j] + "\t");
           }
           System.out.println();
       }

        System.out.println("\nVetor C (quantidade de negativos por linha):");
        for (int i = 0; i < C.length; i++) {
            System.out.println("Linha " + (i + 1) + ": " + C[i] + " negativos");
        }
    }
}
