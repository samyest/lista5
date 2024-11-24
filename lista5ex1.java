import java.util.Random;

public class lista5ex1 {
    public static void main(String[] args) {

        int linhas = 7;
        int colunas = 9;
        int[][] matriz = new int[linhas][colunas];
        Random random = new Random();
        int soma = 0;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = random.nextInt(100); 
                soma += matriz[i][j];
            }
        }
        System.out.println("matriz 7x9:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
    
            System.out.println();
        
    }
        System.out.println("\nsoma dos elementos da matriz: " + soma);
    }
}
