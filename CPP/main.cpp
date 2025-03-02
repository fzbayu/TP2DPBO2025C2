#include <iostream>
#include <list>
#include "baju.cpp"

int main() {
    int pilihan, n;
    int harga, stok;
    string id, nama, jenis, bahan, warna, size, merk;

    list<baju> list_produk;  

    cout << "Menu:\n";
    cout << "1. Tambah Produk PETSHOP\n";
    cout << "2. Tambah Produk AKSESORIS\n";
    cout << "3. Tambah Produk BAJU\n";
    cout << "4. Tampilkan Semua Produk\n";
    cout << "5. Keluar\n";

    // 5 data pertama
    list_produk.push_back(baju("P001", "Whiskas", 20000, 10, "", "", "", "", ""));
    list_produk.push_back(baju("A001", "Topi_Kucing", 20000, 15, "Aksesoris", "Katun", "Merah", "", ""));
    list_produk.push_back(baju("B001", "Baju_Kucing", 50000, 20, "Baju", "Katun", "Hitam", "L", "Catshirt"));
    list_produk.push_back(baju("P002", "Bolt", 60000, 12, "", "", "", "", ""));
    list_produk.push_back(baju("A002", "Kalung_Kucing", 30000, 8, "Aksesoris", "Kulit", "Coklat", "", ""));

    do {
        cout << "\nPilihan Menu: ";
        cin >> pilihan;
        switch (pilihan) {
            case 1: { // PETSHOP
                cout << "Jumlah produk PETSHOP yang mau ditambahkan: ";
                cin >> n;
                for (int i = 0; i < n; i++) {
                    cout << "Masukkan ID, Nama, Harga, Stok: ";
                    cin >> id >> nama >> harga >> stok;

                    // Masukkan produk petshop ke list 
                    list_produk.push_back(baju(id, nama, harga, stok, "", "", "", "", ""));
                }
                break;
            }
            case 2: { // AKSESORIS
                cout << "Jumlah produk AKSESORIS yang mau ditambahkan: ";
                cin >> n;
                for (int i = 0; i < n; i++) {
                    cout << "Masukkan ID, Nama, Harga, Stok, Jenis, Bahan, Warna: ";
                    cin >> id >> nama >> harga >> stok >> jenis >> bahan >> warna;

                    // Masukkan produk aksesoris ke list
                    list_produk.push_back(baju(id, nama, harga, stok, jenis, bahan, warna, "", ""));
                }
                break;
            }
            case 3: { // BAJU
                cout << "Jumlah produk BAJU yang mau ditambahkan: ";
                cin >> n;
                for (int i = 0; i < n; i++) {
                    cout << "Masukkan ID, Nama, Harga, Stok, Jenis, Bahan, Warna, Size, Merk: ";
                    cin >> id >> nama >> harga >> stok >> jenis >> bahan >> warna >> size >> merk;

                    // Masukkan produk aksesoris ke list
                    list_produk.push_back(baju(id, nama, harga, stok, jenis, bahan, warna, size, merk));
                }
                break;
            }
            case 4: { // Tampilkan Semua Produk
                if (!list_produk.empty()) {
                    list_produk.front().tampilkan(list_produk);
                } else {
                    cout << "Produk Kosong\n";
                }
                break;
            }                                     
            case 5: { // Keluar
                cout << "Keluar dari program.\n";
                break;
            }
        }
    } while (pilihan != 5);

    return 0;
}
