import java.util.Scanner;

public class PersegiPanjang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan Panjang : ");
        double Panjang = scanner.nextDouble();

        System.out.println("Masukan Lebar : ");
        double Lebar = scanner.nextDouble();

        double luas = Panjang * Lebar ;

        System.out.println("Luas Persegi Panjang : " + luas);

        scanner.close();
}

}