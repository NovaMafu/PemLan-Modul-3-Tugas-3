import java.util.Scanner;

public class geometry {
    static class Lingkaran {

        public static final double PI = 3.14;
        public static final double PI1 = 3.14;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan radius: ");
            double radius = scanner.nextDouble();

            double area = hitungLuas(radius);
            double keliling = hitungKeliling(radius);

            System.out.println("Luas lingkaran: " + area);
            System.out.println("Keliling lingkaran: " + keliling);

            scanner.close();
        }

        private static double hitungKeliling(double radius) {
            double keliling = 2 * PI * radius;
            return keliling;
        }

        private static double hitungLuas(double radius) {
            double luas = PI1 * radius * radius;
            return luas;
        }
    }
}
