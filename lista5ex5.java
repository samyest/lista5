import java.util.Scanner;

public class lista5ex5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[][] A = new int[5][5];
            int[][] B = new int[5][5];
            int[][] S = new int[5][5];
            
            System.out.println("Digite os elementos da matriz A (5x5):");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.printf("A[%d][%d]: ", i, j);
                    A[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Digite os elementos da matriz B (5x5):");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.printf("B[%d][%d]: ", i, j);
                    B[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    S[i][j] = A[i][j] + B[i][j];
                }
            }
            System.out.println("Matriz S (soma de A e B):");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(S[i][j] + "\t");
                }
                System.out.println();
            }
          }
     }
    }

