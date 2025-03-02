from baju import baju

print("Menu: ")
print("1. Tambah Produk PETSHOP")
print("2. Tambah Produk AKSESORIS")
print("3. Tambah Produk BAJU")
print("4. Tampilkan Semua Produk")
print("5. Keluar")

list_produk = [] 

list_produk.append(baju("P001", "Whiskas", 20000, 10, "", "", "", "", ""))
list_produk.append(baju("A001", "Topi_Kucing", 20000, 15, "Aksesoris", "Katun", "Merah", "", ""))
list_produk.append(baju("B001", "Baju_Kucing", 50000, 20, "Baju", "Katun", "Hitam", "L", "Catshirt"))
list_produk.append(baju("P002", "Bolt", 60000, 12, "", "", "", "", ""))
list_produk.append(baju("A002", "Kalung_Kucing", 30000, 8, "Aksesoris", "Kulit", "Coklat", "", ""))

pilihan = 0
    
while pilihan != 5:
        
        try:
            pilihan = int(input("\nPilihan Menu: "))
            
            if pilihan == 1:  # PETSHOP
                n = int(input("Jumlah produk PETSHOP yang mau ditambahkan: "))
                
                for i in range(n):
                    print("Masukkan ID, Nama, Harga, Stok: ", end="")
                    data = input().split()
                    id = data[0]
                    nama = data[1]
                    harga = int(data[2])
                    stok = int(data[3])
                    
                    temp = baju(id, nama, harga, stok, "", "", "", "", "")
                    list_produk.append(temp)
                    
            elif pilihan == 2:  # AKSESORIS
                n = int(input("Jumlah produk AKSESORIS yang mau ditambahkan: "))
                
                for i in range(n):
                    print("Masukkan ID, Nama, Harga, Stok, Jenis, Bahan, Warna: ", end="")
                    data = input().split()
                    id = data[0]
                    nama = data[1]
                    harga = int(data[2])
                    stok = int(data[3])
                    jenis = data[4]
                    bahan = data[5]
                    warna = data[6]
                    
                    temp = baju(id, nama, harga, stok, jenis, bahan, warna, "", "")
                    list_produk.append(temp)
                    
            elif pilihan == 3:  # BAJU
                n = int(input("Jumlah produk BAJU yang mau ditambahkan: "))
                
                for i in range(n):
                    print("Masukkan ID, Nama, Harga, Stok, Jenis, Bahan, Warna, Size, Merk: ", end="")
                    data = input().split()
                    id = data[0]
                    nama = data[1]
                    harga = int(data[2])
                    stok = int(data[3])
                    jenis = data[4]
                    bahan = data[5]
                    warna = data[6]
                    size = data[7]
                    merk = data[8]
                    
                    temp = baju(id, nama, harga, stok, jenis, bahan, warna, size, merk)
                    list_produk.append(temp)
                    
            elif pilihan == 4: # TAMPILKAN
                if list_produk:
                    baju.tampilkan(list_produk)
                else:
                    print("Produk Kosong")
                    
            elif pilihan == 5:  # KELUAR
                print("Keluar Program!")
                
            else:
                print("Pilihan tidak valid!")
                
        except ValueError:
            print("Input harus berupa angka!")
