import java.util.ArrayList; 
import java.util.Scanner; 

public class main {
    public static void main(String[] args){
        int pilihan, n;
        int harga, stok;
        String id, nama, jenis, bahan, warna, size, merk;
  
        System.out.print("Menu:\n");
        System.out.print("1. Tambah Produk PETSHOP\n");
        System.out.print("2. Tambah Produk AKSESORIS\n");
        System.out.print("3. Tambah Produk BAJU\n");
        System.out.print("4. Tampilkan Semua Produk\n");
        System.out.print("5. Keluar\n");

        Scanner sc = new Scanner(System.in); 
        ArrayList<baju> list_produk = new ArrayList<>(); 

        list_produk.add(new baju("P001", "Whiskas", 20000, 10, "", "", "", "", ""));
        list_produk.add(new baju("A001", "Topi_Kucing", 20000, 15, "Aksesoris", "Katun", "Merah", "", ""));
        list_produk.add(new baju("B001", "Baju_Kucing", 50000, 20, "Baju", "Katun", "Hitam", "L", "Catshirt"));
        list_produk.add(new baju("P002", "Bolt", 60000, 12, "", "", "", "", ""));
        list_produk.add(new baju("A002", "Kalung_Kucing", 30000, 8, "Aksesoris", "Kulit", "Coklat", "", ""));

        do{ 
            System.out.print("\nPilihan Menu: ");
            pilihan = sc.nextInt();

            switch (pilihan){
                case 1: { // PETSHOP
                    System.out.print("Jumlah produk PETSHOP yang mau ditambahkan: ");
                    n = sc.nextInt(); // Input jumlah produk
                
                    for (int i = 0; i < n; i++) { 
                        System.out.print("Masukkan ID, Nama, Harga, Stok: "); 
                        id = sc.next(); 
                        nama = sc.next(); 
                        harga = sc.nextInt(); 
                        stok = sc.nextInt(); 

                        baju temp = new baju(id, nama, harga, stok, "", "", "", "", "");
                        list_produk.add(temp); 
                    }
                    break;
                }
                case 2: { // AKSESORIS
                    System.out.print("Jumlah produk AKSESORIS yang mau ditambahkan: ");
                    n = sc.nextInt(); // Input jumlah produk
                
                    for (int i = 0; i < n; i++) { 
                        System.out.print("Masukkan ID, Nama, Harga, Stok, Jenis, Bahan, Warna: "); 
                        id = sc.next();    
                        nama = sc.next();  
                        harga = sc.nextInt(); 
                        stok = sc.nextInt();  
                        jenis = sc.next();  
                        bahan = sc.next();   
                        warna = sc.next();  

                        baju temp = new baju(id, nama, harga, stok, jenis, bahan, warna, "", "");
                        list_produk.add(temp); 
                    }
                    break;
                }
                case 3: { // BAJU
                    System.out.print("Jumlah produk BAJU yang mau ditambahkan: ");
                    n = sc.nextInt(); // Input jumlah produk
                
                    for (int i = 0; i < n; i++) { 
                        System.out.print("Masukkan ID, Nama, Harga, Stok, Jenis, Bahan, Warna, Size, Merk: "); 
                        id = sc.next();    
                        nama = sc.next();   
                        harga = sc.nextInt(); 
                        stok = sc.nextInt();  
                        jenis = sc.next();   
                        bahan = sc.next();  
                        warna = sc.next();  
                        size = sc.next();
                        merk = sc.next();

                        baju temp = new baju(id, nama, harga, stok, jenis, bahan, warna, size, merk);
                        list_produk.add(temp);
                    }
                    break;
                }
                case 4: { // TAMPILKAN
                    if (!list_produk.isEmpty()) {
                        list_produk.get(0).tampilkan(list_produk);
                    } else {
                        System.out.print("Produk Kosong\n");
                    }
                    break;
                }
                case 5:{ // KELUAR
                    System.out.print("Keluar Program!\n"); 
                }
            }
        } while (pilihan != 5); // keluar program jika inputan adalah 5
    }
}
