class petshop:

    # ATRIBUT PRIVATE
    __id = 0
    __nama_produk = ""
    __harga_produk = 0
    __stok_produk = 0

    # CONSTRUCTOR
    def __init__(self, id=0, nama_produk="", harga_produk=0, stok_produk=0):
        self.__id = id
        self.__nama_produk = nama_produk
        self.__harga_produk = harga_produk
        self.__stok_produk = stok_produk

    # GETTER
    def get_id(self):
        return self.__id

    def get_nama_produk(self):
        return self.__nama_produk

    def get_harga_produk(self):
        return self.__harga_produk
    
    def get_stok_produk(self):
        return self.__stok_produk

    # SETTER
    def set_id(self, id):
        self.__id = id

    def set_bahan(self, bahan):
        self.__bahan = bahan

    def set_warna(self, warna):
        self.__warna = warna
