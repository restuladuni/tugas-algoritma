import java.util.Scanner;

public class GANJILGENAP {



    public static void main(String[] args) {
        int angka;
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan angka : ");
        angka = sc.nextInt();


        if (angka % 2 == 0){
            System.out.println("GENAP");
        } else {
            System.out.println("GANJIL");
        }


        sc.close();
            
        }
    }

    

