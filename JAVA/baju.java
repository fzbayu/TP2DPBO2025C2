import java.util.ArrayList;
import java.util.List;

public class baju extends aksesoris{
    private String size;
    private String merk;
    
        // CONSTRUCTOR
        public baju(){
            this.size = "";
            this.merk = "";
        }

        // CONSTRUCTOR dengan parameter
        public baju(String id, String nama, int harga, int stok, String jenis, String bahan, String warna, String size, String merk) {
            super(id, nama, harga, stok, jenis, bahan, warna); 
            this.size = size;
            this.merk = merk;
        }

        // Fungsi untuk menampilkan data dalam tabel
        public void tampilkan(List<baju> listProduk) {
            System.out.print("\n");
            // Menyimpan panjang maksimal dari setiap kolom
            int maxId = 2, maxNama = 4, maxHarga = 5, maxStok = 4;
            int maxJenis = 5, maxBahan = 5, maxWarna = 5, maxSize = 4, maxMerk = 4;

            // Cari panjang maksimal dari setiap kolom
            for (baju produk : listProduk) {
                maxId = Math.max(maxId, produk.get_id().length());
                maxNama = Math.max(maxNama, produk.get_nama_produk().length());
                maxHarga = Math.max(maxHarga, String.valueOf(produk.get_harga_produk()).length());
                maxStok = Math.max(maxStok, String.valueOf(produk.get_stok_produk()).length());
                maxJenis = Math.max(maxJenis, produk.get_jenis().length());
                maxBahan = Math.max(maxBahan, produk.get_bahan().length());
                maxWarna = Math.max(maxWarna, produk.get_warna().length());
                maxSize = Math.max(maxSize, produk.get_size().length());
                maxMerk = Math.max(maxMerk, produk.get_merk().length());
            }
            
            // HEADER
            System.out.print("+" + createRepeatedString('-', maxId + 2) 
                    + "+" + createRepeatedString('-', maxNama + 2)
                    + "+" + createRepeatedString('-', maxHarga + 2)
                    + "+" + createRepeatedString('-', maxStok + 2)
                    + "+" + createRepeatedString('-', maxJenis + 2)
                    + "+" + createRepeatedString('-', maxBahan + 2)
                    + "+" + createRepeatedString('-', maxWarna + 2)
                    + "+" + createRepeatedString('-', maxSize + 2)
                    + "+" + createRepeatedString('-', maxMerk + 2) + "+\n");

            System.out.print("| " + leftPad("ID", maxId)
                    + " | " + leftPad("Nama", maxNama)
                    + " | " + leftPad("Harga", maxHarga)
                    + " | " + leftPad("Stok", maxStok)
                    + " | " + leftPad("Jenis", maxJenis)
                    + " | " + leftPad("Bahan", maxBahan)
                    + " | " + leftPad("Warna", maxWarna)
                    + " | " + leftPad("Size", maxSize)
                    + " | " + leftPad("Merk", maxMerk)
                    + " |\n");

            System.out.print("+" + createRepeatedString('-', maxId + 2) 
                    + "+" + createRepeatedString('-', maxNama + 2)
                    + "+" + createRepeatedString('-', maxHarga + 2)
                    + "+" + createRepeatedString('-', maxStok + 2)
                    + "+" + createRepeatedString('-', maxJenis + 2)
                    + "+" + createRepeatedString('-', maxBahan + 2)
                    + "+" + createRepeatedString('-', maxWarna + 2)
                    + "+" + createRepeatedString('-', maxSize + 2)
                    + "+" + createRepeatedString('-', maxMerk + 2) + "+\n");

            // DATA
            for (baju produk : listProduk) {
                System.out.print("| " + leftPad(produk.get_id(), maxId)
                        + " | " + leftPad(produk.get_nama_produk(), maxNama)
                        + " | " + leftPad(String.valueOf(produk.get_harga_produk()), maxHarga)
                        + " | " + leftPad(String.valueOf(produk.get_stok_produk()), maxStok)
                        + " | " + leftPad(produk.get_jenis(), maxJenis)
                        + " | " + leftPad(produk.get_bahan(), maxBahan)
                        + " | " + leftPad(produk.get_warna(), maxWarna)
                        + " | " + leftPad(produk.get_size(), maxSize)
                        + " | " + leftPad(produk.get_merk(), maxMerk)
                        + " |\n");
            }

            System.out.print("+" + createRepeatedString('-', maxId + 2) 
                    + "+" + createRepeatedString('-', maxNama + 2)
                    + "+" + createRepeatedString('-', maxHarga + 2)
                    + "+" + createRepeatedString('-', maxStok + 2)
                    + "+" + createRepeatedString('-', maxJenis + 2)
                    + "+" + createRepeatedString('-', maxBahan + 2)
                    + "+" + createRepeatedString('-', maxWarna + 2)
                    + "+" + createRepeatedString('-', maxSize + 2)
                    + "+" + createRepeatedString('-', maxMerk + 2) + "+\n");
        }

        // Untuk membuat string berulang
        private static String createRepeatedString(char c, int length) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < length; i++) {
                sb.append(c);
            }
            return sb.toString();
        }

        // Untuk padding kiri
        private static String leftPad(String s, int width) {
            StringBuilder sb = new StringBuilder(s);
            while (sb.length() < width) {
                sb.append(' ');
            }
            return sb.toString();
        }

        // GETTER
        public String get_size(){
            return this.size; 
        }
        public String get_merk(){
            return this.merk; 
        }
        
        // SETTER
        public void set_size(String size){
            this.size = size;
        }
        public void set_merk(String merk){
            this.merk = merk;
        }
};