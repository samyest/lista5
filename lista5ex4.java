import java.util.Random;

public class lista5ex4 {
        public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        Random random = new Random();
        int somaLinhasPares = 0;

        System.out.println("Matriz 10x10:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = random.nextInt(101);
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < 10; i += 2) {
            for (int j = 0; j < 10; j++) {
                somaLinhasPares += matriz[i][j];
            }
        }
        System.out.println("\nSoma das linhas pares: " + somaLinhasPares);
    }
}
