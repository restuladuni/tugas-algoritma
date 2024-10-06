import java.util.*;

public class Warung {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double hargaPerKg = 28000;

        System.out.println("Jumlah telur (kg): ");
        double jumlahTelur = scanner.nextDouble();

        System.out.println("Uang yang dibayar: ");
        int uangDibayar = scanner.nextInt();

        double totalHarga = jumlahTelur * hargaPerKg;
        int kembalian = uangDibayar - (int)totalHarga;

        if (kembalian < 0){
            System.out.println("Uang Anda Kurang!!!");
        } else {
            System.out.println("Jumlah Telur: " + jumlahTelur + "  kg");  
            System.out.println("Total Harga: Rp " + (int) totalHarga);
            System.out.println("Uang Kembalian: Rp " + kembalian);
        }
        
        scanner.close();
    }
}
        


    

    

    

