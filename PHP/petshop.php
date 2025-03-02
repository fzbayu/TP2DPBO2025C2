<?php
    // ATRIBUT PRIVATE
    class petshop{
        private $id = '';
        private $nama_produk = '';
        private $harga_produk = 0;
        private $stok_produk = 0;
        private $foto = '';

    // CONSTRUCTOR
    public function __construct($id= 0, $nama_produk = '', $harga_produk=0, $stok_produk=0, $foto = ''){
        $this->id = $id;
        $this->nama_produk = $nama_produk;
        $this->harga_produk = $harga_produk;
        $this->stok_produk = $stok_produk;
        $this->foto = $foto;
    }

    // GETTER
    public function get_id(){
        return $this->id;
    }
    public function get_nama_produk(){
        return $this->nama_produk;
    }
    public function get_harga_produk(){
        return $this->harga_produk;
    }
    public function get_stok_produk(){
        return $this->stok_produk;
    }
    public function get_foto() {
        return $this->foto;
    }
    
    // SETTER
    public function set_id($id){
        $this->id = $id;
    }
    public function set_nama_produk($nama_produk){
        $this->nama_produk = $nama_produk;
    }
    public function set_harga_produk($harga_produk){
        $this->harga_produk = $harga_produk;
    }
    public function set_stok_produk($stok_produk){
        $this->stok_produk = $stok_produk;
    }
    public function set_foto($foto) {
        $this->foto = $foto;
    }
}
?>