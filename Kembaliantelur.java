import java.util.*;


public class Kembaliantelur {
    public static void main(String[] args) {
        double perKilo, diskon, kembalian, uangBayar,totalHarga, telur;
        Scanner input = new Scanner(System.in);
        perKilo = 28000;
        diskon = 0.1;
        System.out.println("Berapa Kg Telur: ");
        telur = input.nextDouble();
        System.out.println("Uang Dibayarkan: ");
        uangBayar = input.nextDouble();

        totalHarga = telur * perKilo;
        if (telur > 3) {
            diskon = totalHarga *  diskon;
        } else {
            diskon = 0.0;
        }
        double subtotal = totalHarga - diskon;
        kembalian = uangBayar - subtotal;

        System.out.println("Total Kg Yang Dibelli: " + (int) telur);
        System.out.println("total Harga: "+ (int) totalHarga);
        System.out.println("Discount: "+ (int) diskon);
        System.out.println("Subtotal: "+ (int) subtotal);
        System.out.println("Uang Kembalian: "+ (int) kembalian);

        input.close();   
            
        }
        
    }

    

    

