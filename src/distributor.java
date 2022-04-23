//Mengimpor Scanner ke Program
import java.util.Scanner;
//subclass
//Berikut merupakan subclass yang akan mewarisi sifat-sifat pada superclass
//menggunakan konsep inheritance
public class distributor extends reseller {
    //Atribut
    //Berisi data dan nilai data yang digunakan pada codingan ini
    public String idPesan, nama, kota;
    public int jumlah_barang, diskonDistributor;
    public int harga_normal = 200000, ongkir, harga,total = harga_normal*jumlah_barang;
    
    //membuat Scanner baru
    Scanner in = new Scanner(System.in);
    
    //Berikut merupakan overriding Method
    //Pada method input ini saya fungsikan sebagai perintah user untuk menginputkan secara manual
    //menggunakan fungsi Scanner
    @Override
void input(){
    System.out.println("");
    System.out.print("Masukkan ID pesan        : ");
    idPesan = in.nextLine();
    System.out.print("Masukkan Nama Anda       : ");
    nama=in.nextLine();
    System.out.print("Masukkan Kota anda       : ");
    kota=in.nextLine();
    System.out.print("Masukkan Jumlah barang   : ");
    jumlah_barang = in.nextInt();
}

//Berikut merupakan overriding Method
//Pada method BiayaPemesanan ini saya fungsikan untuk menentukan harga ongkir
//Didalam method ini saya menggunakan seleksi kondisi switch case 
    @Override
void BiayaPemesanan(){
    switch (kota){
        case "Gresik":
        ongkir=30000;
        break;
        case "Jakarta":
            ongkir=20000;
            break;
        case "Bandung":
            ongkir=25000;
                break;
        case "Surabaya":
            ongkir=30000;
            break;
        case "Balikpapan":
            ongkir=40000;
            break;
        case "Medan":
            ongkir=35000;
            break;
        case "Padang":
            break;
        default:
            System.out.println("");
}
}

//Berikut merupakan overriding Method
//Pada method keluaran ini saya fungsikan untuk menampilkan semua tampilan dan hasil akhir nya
//Didalam method ini terdapat seleksi kondisi if else yang saya gunakan untuk membuat diskon
    @Override
void Keluaran(){
    int total = harga_normal*jumlah_barang;
    System.out.println("");
    System.out.println("----------------------------------------");
    System.out.println("ID pesan                 : "+idPesan);
    System.out.println("Nama                     : "+nama);
    System.out.println("Kota                     : "+kota);
    System.out.println("");
    System.out.println("Ongkos Kirim             : "+ongkir);
    System.out.println("Jumlah barang            : "+jumlah_barang);
    System.out.println("Harga satu barang        : "+harga_normal);
    System.out.println("");
        if (jumlah_barang>=20){
        diskonDistributor=total*30/100;
            harga=total+ongkir-diskonDistributor;
            System.out.println(">Selamat anda mendapatkan diskon 30%<" );
            System.out.println("Total Diskon             : "+diskonDistributor);
            System.out.println("Total Biaya Pemesanan    : "+harga);
            System.out.println("");
            System.out.println("+======================================+");
           
    }
    else{
            int totall=total+ongkir;
            System.out.println("Total Biaya Pemesanan    : "+totall);
            System.out.println("");
            System.out.println("+======================================+");
    }
}
}