
import java.util.Scanner;  // Import the Scanner class
public class DiskonBarangLagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer pilih, harga, jumlah;
        double diskon, bayar;
        double total = 0;
        double totalakhir = 0;
        double kembalian = 0;
        
        System.out.println("Program Diskon");
        System.out.println("1. Sandal\t[Rp30000]");
        System.out.println("2. Tas\t\t[Rp50000]");
        System.out.println("3. Sepatu\t[Rp150000]");
        System.out.print("Pilih kode barang yang akan dibeli! : "); 
        pilih = input.nextInt();
        
        switch(pilih){
            case 1:
                harga = 30000;
                System.out.print("Masukkan jumlah\t: ");
                jumlah = input.nextInt();
                total = harga*jumlah;

                System.out.println("Total Akhir\t: Rp" + total);
                break;
            case 2:
                harga = 50000;
                System.out.print("Masukkan jumlah\t: ");
                jumlah = input.nextInt();
                total = harga*jumlah;

                System.out.println("Total Akhir\t: Rp" + total);
                break;
            case 3:
                harga = 150000;
                System.out.print("Masukkan jumlah\t: ");
                jumlah = input.nextInt();
                total = harga*jumlah;
//                System.out.println("Total\t\t: Rp" + total);
//                diskon = 0.15*total;
//                System.out.println("Diskon\t\t: Rp" + diskon);
//                total = total-diskon;
                System.out.println("Total Akhir\t: Rp" + total);
                break;
            default:
                System.out.println("Kode barang tidak ditemukan!");
        }
        
        if (total>=100000 && total<=200000) {
            diskon = 0.05*total;
            System.out.println("Diskon 5%");
            System.out.println("Diskon\t\t: Rp" + diskon);
            totalakhir = total-diskon;
            System.out.println("Grand Total\t: Rp" + totalakhir);
        } else if(total>200000 && total<=300000){
            diskon = 0.1*total;
            System.out.println("Diskon 10%");
            System.out.println("Diskon\t\t: Rp" + diskon);
            totalakhir = total-diskon;
            System.out.println("Grand Total\t: Rp" + totalakhir);
        } else if(total>300000 && total<=400000){
            diskon = 0.15*total;
            System.out.println("Diskon 15%");
            System.out.println("Diskon\t\t: Rp" + diskon);
            totalakhir = total-diskon;
            System.out.println("Grand Total\t: Rp" + totalakhir);
        } else if(total>400000 && total<=500000){
            diskon = 0.2*total;
            System.out.println("Diskon 20%");
            System.out.println("Diskon\t\t: Rp" + diskon);
            totalakhir = total-diskon;
            System.out.println("Grand Total\t: Rp" + totalakhir);
        } else if(total>500000){
            diskon = 0.25*total;
            System.out.println("Diskon 25%");
            System.out.println("Diskon\t\t: Rp" + diskon);
            totalakhir = total-diskon;
            System.out.println("Grand Total\t: Rp" + totalakhir);
        }
        
        System.out.print("Masukkan uang pembayaran\t: Rp");
        bayar = input.nextDouble();
        kembalian = bayar-totalakhir;
        if (kembalian == 0) {
            System.out.println("Uang Pas");
        } else if(kembalian > 0){
            System.out.println("Kembalian\t: Rp" + kembalian);
        } else {
            System.out.println("Uang yang dibayarkan kurang!");
        }
    }
}