import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int firstColumn = scanner.nextInt();
        int secondColumn = scanner.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            int tmp = matrix[i][firstColumn];
            matrix[i][firstColumn] = matrix[i][secondColumn];
            matrix[i][secondColumn] = tmp;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}