from aksesoris import aksesoris
from tabulate import tabulate

class baju(aksesoris):

    # ATRIBUT PRIVATE
    __size = ""
    __merk = ""

    # CONSTRUCTOR
    def __init__(self, id, nama_produk, harga_produk, stok_produk, jenis, bahan, warna, size="", merk=""):
        super().__init__(id, nama_produk, harga_produk, stok_produk, jenis, bahan, warna)
        self.__size = size
        self.__merk = merk

    # GETTER
    def get_size(self):
        return self.__size

    def get_merk(self):
        return self.__merk

    # SETTER
    def set_size(self, size):
        self.__size = size

    def set_merk(self, merk):
        self.__merk = merk

    # Fungsi untuk tampilkan produk dengan tabel
    def tampilkan(list_produk):
        if not list_produk:
            print("Produk Kosong")
            return

        data = []
        headers = ["ID", "Nama", "Harga", "Stok", "Jenis", "Bahan", "Warna", "Size", "Merk"]
        
        for produk in list_produk:
            data.append([
                produk.get_id(),
                produk.get_nama_produk(),
                produk.get_harga_produk(),
                produk.get_stok_produk(),
                produk.get_jenis(),
                produk.get_bahan(),
                produk.get_warna(),
                produk.get_size(),
                produk.get_merk()
            ])
        
        print(tabulate(data, headers=headers, tablefmt="grid"))

    