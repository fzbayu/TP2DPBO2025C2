<?php
require_once "baju.php";

$list_produk = [
    new petshop("P001", "Whiskas", 20000, 10, "images/whiskas.jpg", "", "", "", "", ""),
    new aksesoris("A001", "Topi_Kucing", 20000, 15, "images/topi_kucing.jpg", "Aksesoris", "Katun", "Merah", "", ""),
    new baju("B001", "Baju_Kucing", 50000, 20, "images/baju_kucing.jpeg", "Baju", "Katun", "Hitam", "L", "Catshirt"),
    new petshop("P002", "Bolt", 60000, 12, "images/bolt.jpeg", "", "", "", "", ""),
    new aksesoris("A002", "Kalung_Kucing", 30000, 8, "images/kalung_kucing.jpg", "Aksesoris", "Kulit", "Coklat", "", "")
];

// Menggunakan tabel untuk menampilkan data keseluruhan
echo "<h2>Daftar Produk Petshop</h2>";
echo "<table border='1' cellpadding='5' cellspacing='0'>";
echo "<tr>
        <th>ID</th>
        <th>Nama</th>
        <th>Harga</th>
        <th>Stok</th>
        <th>Foto</th>
        <th>Jenis</th>
        <th>Bahan</th>
        <th>Warna</th>
        <th>Size</th>
        <th>Merk</th>
    </tr>";

foreach ($list_produk as $produk) {
    echo "<tr>";
    echo "<td>" . $produk->get_id() . "</td>";
    echo "<td>" . $produk->get_nama_produk() . "</td>";
    echo "<td>Rp " . number_format($produk->get_harga_produk(), 0, ',', '.') . "</td>";
    echo "<td>" . $produk->get_stok_produk() . "</td>";
    
    // Menampilkan foto produk
    echo "<td><img src='" . $produk->get_foto() . "' width='100'></td>";

    if ($produk instanceof Aksesoris) {
        echo "<td>" . $produk->get_jenis() . "</td>";
        echo "<td>" . $produk->get_bahan() . "</td>";
        echo "<td>" . $produk->get_warna() . "</td>";
    } else {
        echo "<td>-</td><td>-</td><td>-</td>";
    }

    if ($produk instanceof Baju) {
        echo "<td>" . $produk->get_size() . "</td>";
        echo "<td>" . $produk->get_merk() . "</td>";
    } else {
        echo "<td>-</td><td>-</td>";
    }

    echo "</tr>";
}

echo "</table>";
?>
