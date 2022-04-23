//Mengimpor Scanner ke Program
import java.util.Scanner;
//Main class
//Berikut merupakan mainclass yang berfungsi untuk menjalankan program
public class main {
    public static void main(String[] args) {
        //membuat Scanner baru
        Scanner in = new Scanner(System.in);
        System.out.println("+======================================+");
        System.out.println("|=====+APLIKASI PEMESANAN BARANG+======|");
        System.out.println("+======================================+");
        System.out.println("Menu ");
        System.out.println("1. Distributor");
        System.out.println("2. Reseller");
        //user diperintahkan untuk menginputkan pilihan
        System.out.print("Masukkan pilihanmu : ");
        int pilih = in.nextInt();
        
//seleksi kondisi if else if 
//saya fungsikan untuk menentukan pilihan dari kondisi yang telah diberikan
        if (pilih==1){
            //objek
            //membuat objek dari class distributor
            distributor a = new distributor();
            //pemanggilan method dengan menggunakan objek
            //memanggil 
            a.input();
            a.BiayaPemesanan();
            a.Keluaran();
        }
        else if (pilih==2){
            //objek
             //membuat objek dari class reseller
            reseller a = new reseller();
            //pemanggilan method dengan menggunakan objek
            a.input();
            a.BiayaPemesanan();
            a.Keluaran();
        }
        else{
            System.out.println("Pilihan yang anda masukkan tidak tersedia");
        }
    }
}
