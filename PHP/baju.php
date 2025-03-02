<?php

    require_once "aksesoris.php";

    // ATRIBUT PRIVATE
    class baju extends aksesoris{
        private $size = '';
        private $merk = '';

    // CONSTRUCTOR
    public function __construct($id, $nama_produk, $harga_produk, $stok_produk, $foto, $jenis, $bahan, $warna, $size, $merk) {
        parent::__construct($id, $nama_produk, $harga_produk, $stok_produk, $foto, $jenis, $bahan, $warna);
        $this->size = $size;
        $this->merk = $merk;
    }

    // GETTER
    public function get_size(){
        return $this->size;
    }
    public function get_merk(){
        return $this->merk;
    }  
    
    // SETTER
    public function set_size($size){
        $this->size = $size;
    }
    public function set_merk($merk){
        $this->merk = $merk;
    }

    // Fungsi untuk tampilkan produk
    public function tampilkan(){
        echo "size: " . $this->size . "<br>";
        echo "Nama: " . $this->merk . "<br>";
        echo "Kategori: " . $this->kategori_produk . "<br>";
        echo "Harga: " . $this->warna . "<br>";
        echo "Foto: <img src='" . $this->foto . "' wsizeth='100'><br>";
    }
}
?>