import java.util.Scanner;

public class GaussElimination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matris boyutunu girin (n): ");
        int n = scanner.nextInt();

        double[][] matrix = new double[n][n];
        double[] b = new double[n];
        //üst üçgen
        // Matris elemanlarının alınması
        System.out.println("Matris elemanlarını girin:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextDouble();
            }
            System.out.print("b[" + i + "]: ");
            b[i] = scanner.nextDouble();
        }

        // Üst üçgen matris oluşturma
        for (int i = 0; i < n; i++) {
            // Köşegendeki elemanlar 1 yapmak için gerçekleştirilen işlem
            double aii = matrix[i][i];
            for (int j = i; j < n; j++) {
                matrix[i][j] /= aii;
            }
            b[i] /= aii;//eşitlik vektörünün bölünmesi

            // Diğer satırlardan çıkarma işlemi
            for (int k = i + 1; k < n; k++) {
                double factor = matrix[k][i];
                for (int j = i; j < n; j++) {
                    matrix[k][j] -= factor * matrix[i][j];
                }
                b[k] -= factor * b[i];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+ "   ");
            }
            System.out.println(b[i]);
        }
        // Geriye doğru yerine koyma işlemi
        double[] x = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            x[i] = b[i];
            for (int j = i + 1; j < n; j++) {
                x[i] -= matrix[i][j] * x[j];
            }
        }

        System.out.println("Sonuçlar:");
        for (int i = 0; i < n; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
