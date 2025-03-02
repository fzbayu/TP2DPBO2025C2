# JANJI
Saya Faiz Bayu Erlangga dengan NIM 2311231 mengerjakan Tugas Praktikum 2 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

## DIAGRAM
![image](https://github.com/user-attachments/assets/eb2852d0-b5d3-4f15-b416-f12b458352dc)

Menggunakan konsep multi-inheritance dimana:
Petshop: Kelas dasar yang berisi atribut dan metode umum untuk semua produk toko hewan (id, nama_produk, harga_produk, stok_produk)
Aksesoris: Mewarisi semua dari petshop dan menambahkan properti khusus aksesoris (jenis, bahan, warna)
Baju: Mewarisi semua dari aksesoris (dan secara tidak langsung dari petshop) dan menambahkan properti khusus baju (size, merk)

Dengan method getter dan setter untuk masing-masing atribut dan tampilkan pada class baju.

## PENJELASAN ATRIBUT DAN METHODS
Atribut dalam pemograman 
a. CPP, JAVA, PYTHON
id = ID produk
nama_produk = Nama produk
harga_produk = Harga produk
stok_produk = Jumlah stok tersedia
jenis = Jenis produk (Baju, Aksesoris, dll.)
bahan = Bahan pembuatan produk
warna = Warna produk
size = Ukuran produk (khusus baju)
merk = Merek produk

Setiap class memiliki atribut yang berbeda-beda dan merupakan pewarisan dari orang tua yang pertama yaitu petshop memiliki anak aksesoris dan aksesoris memiliki anak baju
1. Petshop : id, nama_produk, harga_produk, stok_produk
2. Aksesoris(anak dari petshop) : jenis, bahan, warna
3. Baju(anak dari aksesoris) : size, merk

Methods yang digunakan adalah setter dan getter untuk masing-masing atribut dan untuk menampilkan tabel dinamis secara keseluruhan data menggunakan getter dan setter untuk akses atribut. Untuk menambahkan data menggunakan library yang tersedia seperti py: append, java: add, cpp: push_back dalam list langsung di main.

b. PHP
Atribut sama dengan cpp, python, dan java, hanya saja memiliki tambahan atribut foto

## PENJELASAN ALUR PROGRAM
- Program dimulai dengan menampilkan menu utama kepada pengguna
- Beberapa data produk awal langsung dimasukkan ke dalam daftar (list_produk) sebagai contoh.
- Program akan terus berulang sampai user menginputkan angka 5
- Setiap produk yang ditambahkan akan disimpan ke dalam list_produk
- Jika ada produk, maka daftar akan ditampilkan
- Program akan berhenti jika pengguna memilih 5

Dalam bahasa c++, java dan python, menggunakan input user dimana terdapat 5 pilihan yaitu
1. Pilih untuk tambah produk petshop dengan memilih angka '1', produk ini terdiri dari atribut id, nama, harga dan stok
2. Pilih untuk tambah produk aksesoris dengan memilih angka '2', produk ini terdiri dari atribut id, nama, harga, stok, jenis, bahan, warna
3. Pilih untuk tambah produk baju dengan memilih angka '3', produk ini terdiri dari atribut id, nama, harga, stok, jenis, bahan, warna, size, merk
4. Pilih untuk menampilkan semua produk yang ada dalam list dalam bentuk tabel dinamis (Join) dengan memilih angka '4'. Setiap produk memiliki atribut yang berbeda-beda sehingga tampilan pada tabel ada atribut yang kosong
5. Pilih untuk keluar program dengan memilih angka '5'
   
## DOKUMENTASI CPP
![cpp2](https://github.com/user-attachments/assets/231299be-efb6-4384-8e04-f5c1b85ab956)

## DOKUMENTASI JAVA
![java2](https://github.com/user-attachments/assets/434e616e-9ffb-4cbb-b20d-39b86e514b84)

## DOKUMENTASI PYTHON
![py2](https://github.com/user-attachments/assets/a4dea70a-52bf-4811-89ef-39ee791f41cc)

## DOKUMENTASI PHP
![Screenshot 2025-03-02 121056](https://github.com/user-attachments/assets/6aabe8f6-3ac4-4222-b153-b60417604172)
