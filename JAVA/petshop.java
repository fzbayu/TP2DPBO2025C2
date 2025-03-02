import java.util.ArrayList;

public class petshop{
    private String id;
    private String nama_produk;
    private int harga_produk;
    private int stok_produk;
    
        // CONSTRUCTOR
        public petshop(){
            this.id = "";
            this.nama_produk = "";
            this.harga_produk = 0;
            this.stok_produk = 0;
        }

        // CONSTRUCTOR dengan parameter
        public petshop(String id, String nama_produk, int harga_produk, int stok_produk)
        {
            this.id = id;
            this.nama_produk = nama_produk;
            this.harga_produk = harga_produk;
            this.stok_produk = stok_produk;
        }

        // GETTER
        public String get_id(){
            return this.id; 
        }
        public String get_nama_produk(){
            return this.nama_produk; 
        }
        public int get_harga_produk(){
            return this.harga_produk; 
        }
        public int get_stok_produk(){
            return this.stok_produk; 
        }

        // SETTER
        public void set_id(String id){
            this.id = id;
        }
        public void set_nama_produk(String nama_produk){
            this.nama_produk = nama_produk;
        }
        public void set_harga_produk(int harga_produk){
            this.harga_produk = harga_produk;
        }
        public void set_stok_produk(int stok_produk){
            this.stok_produk = stok_produk;
        }

};

