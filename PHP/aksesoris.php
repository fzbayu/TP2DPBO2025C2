<?php
    require_once "petshop.php";

    // ATRIBUT PRIVATE
    class aksesoris extends petshop{
        private $jenis = '';
        private $bahan = '';
        private $warna = '';

    // CONSTRUCTOR
    public function __construct($id, $nama_produk, $harga_produk, $stok_produk, $foto, $jenis, $bahan, $warna) {
        parent::__construct($id, $nama_produk, $harga_produk, $stok_produk, $foto);
        $this->jenis = $jenis;
        $this->bahan = $bahan;
        $this->warna = $warna;
    }

    // GETTER
    public function get_jenis(){
        return $this->jenis;
    }
    public function get_bahan(){
        return $this->bahan;
    }
    public function get_warna(){
        return $this->warna;
    }   
    
    // SETTER
    public function set_jenis($jenis){
        $this->jenis = $jenis;
    }
    public function set_bahan($bahan){
        $this->bahan = $bahan;
    }
    public function set_warna($warna){
        $this->warna = $warna;
    }
}
?>