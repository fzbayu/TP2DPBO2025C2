from petshop import petshop

class aksesoris(petshop):

    # ATRIBUT PRIVATE
    __jenis = ""
    __bahan = ""
    __warna = ""

    # CONSTRUCTOR
    def __init__(self, id, nama_produk, harga_produk, stok_produk, jenis="", bahan="", warna=""):
        super().__init__(id, nama_produk, harga_produk, stok_produk)
        self.__jenis = jenis
        self.__bahan = bahan
        self.__warna = warna

    # GETTER
    def get_jenis(self):
        return self.__jenis

    def get_bahan(self):
        return self.__bahan

    def get_warna(self):
        return self.__warna

    # SETTER
    def set_jenis(self, jenis):
        self.__jenis = jenis

    def set_nama_produk(self, nama_produk):
        self.__nama_produk = nama_produk

    def set_harga_produk(self, harga_produk):
        self.__harga_produk = harga_produk

    def set_stok_produk(self, stok_produk):
        self.__stok_produk = stok_produk

