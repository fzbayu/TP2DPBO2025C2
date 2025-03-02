import java.util.ArrayList;

public class aksesoris extends petshop{
    private String jenis;
    private String bahan;
    private String warna;
    
        // CONSTRUCTOR
        public aksesoris(){
            this.jenis = "";
            this.bahan = "";
            this.warna = "";
        }

        // CONSTRUCTOR dengan parameter
        public aksesoris(String id, String nama_produk, int harga_produk, int stok_produk, String jenis, String bahan, String warna){
            super(id, nama_produk, harga_produk, stok_produk); 
            this.jenis = jenis;
            this.bahan = bahan;
            this.warna = warna;
        }

        // GETTER
        public String get_jenis(){
            return this.jenis; 
        }
        public String get_bahan(){
            return this.bahan; 
        }
        public String get_warna(){
            return this.warna; 
        }
        
        // SETTER
        public void set_jenis(String jenis){
            this.jenis = jenis;
        }
        public void set_bahan(String bahan){
            this.bahan = bahan;
        }
        public void set_warna(String warna){
            this.warna = warna;
        }
};

