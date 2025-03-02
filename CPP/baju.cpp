#include <bits/stdc++.h>
#include <iostream>
#include <string>
#include "aksesoris.cpp"

using namespace std;

class baju :public aksesoris
{
    private:
        string size;
        string merk;
    
        
    // CONSTRUCTOR
    public:
        baju(){
            this->size = "";
            this->merk = "";
        }
        
        baju(string id, string nama_produk, int harga_produk, int stok_produk, string jenis, string bahan, string warna, string size, string merk)
        : aksesoris(id, nama_produk, harga_produk, stok_produk, jenis, bahan, warna)
        {
            this->size = size;
            this->merk = merk;
        }

        // Fungsi menampilkan data dalam tabel
        void tampilkan(list<baju> list_produk) {
            // Menyimpan panjang maksimal dari setiap kolom
            size_t max_id = 2, max_nama = 4, max_harga = 5, max_stok = 4;
            size_t max_jenis = 5, max_bahan = 5, max_warna = 5, max_size = 4, max_merk = 4;
        
            // Cari panjang maksimal dari setiap kolom
            for (auto &produk : list_produk) { 
                max_id = max(max_id, produk.get_id().length());
                max_nama = max(max_nama, produk.get_nama_produk().length());
                max_harga = max(max_harga, to_string(produk.get_harga_produk()).length());
                max_stok = max(max_stok, to_string(produk.get_stok_produk()).length());
                max_jenis = max(max_jenis, produk.get_jenis().length());
                max_bahan = max(max_bahan, produk.get_bahan().length());
                max_warna = max(max_warna, produk.get_warna().length());
                max_size = max(max_size, produk.get_size().length());
                max_merk = max(max_merk, produk.get_merk().length());
            }
            
            // HEADER
            cout << "+" << string(max_id + 2, '-') 
                 << "+" << string(max_nama + 2, '-')
                 << "+" << string(max_harga + 2, '-')
                 << "+" << string(max_stok + 2, '-')
                 << "+" << string(max_jenis + 2, '-')
                 << "+" << string(max_bahan + 2, '-')
                 << "+" << string(max_warna + 2, '-')
                 << "+" << string(max_size + 2, '-')
                 << "+" << string(max_merk + 2, '-') << "+\n";
        
            cout << "| " << setw(max_id) << left << "ID"
                 << " | " << setw(max_nama) << left << "Nama"
                 << " | " << setw(max_harga) << left << "Harga"
                 << " | " << setw(max_stok) << left << "Stok"
                 << " | " << setw(max_jenis) << left << "Jenis"
                 << " | " << setw(max_bahan) << left << "Bahan"
                 << " | " << setw(max_warna) << left << "Warna"
                 << " | " << setw(max_size) << left << "Size"
                 << " | " << setw(max_merk) << left << "Merk"
                 << " |\n";
        
            cout << "+" << string(max_id + 2, '-') 
                 << "+" << string(max_nama + 2, '-')
                 << "+" << string(max_harga + 2, '-')
                 << "+" << string(max_stok + 2, '-')
                 << "+" << string(max_jenis + 2, '-')
                 << "+" << string(max_bahan + 2, '-')
                 << "+" << string(max_warna + 2, '-')
                 << "+" << string(max_size + 2, '-')
                 << "+" << string(max_merk + 2, '-') << "+\n";
        
            // DATA
            for (auto &produk : list_produk) {
                cout << "| " << setw(max_id) << left << produk.get_id()
                     << " | " << setw(max_nama) << left << produk.get_nama_produk()
                     << " | " << setw(max_harga) << left << produk.get_harga_produk()
                     << " | " << setw(max_stok) << left << produk.get_stok_produk()
                     << " | " << setw(max_jenis) << left << produk.get_jenis()
                     << " | " << setw(max_bahan) << left << produk.get_bahan()
                     << " | " << setw(max_warna) << left << produk.get_warna()
                     << " | " << setw(max_size) << left << produk.get_size()
                     << " | " << setw(max_merk) << left << produk.get_merk()
                     << " |\n";
            }
        
            cout << "+" << string(max_id + 2, '-') 
                 << "+" << string(max_nama + 2, '-')
                 << "+" << string(max_harga + 2, '-')
                 << "+" << string(max_stok + 2, '-')
                 << "+" << string(max_jenis + 2, '-')
                 << "+" << string(max_bahan + 2, '-')
                 << "+" << string(max_warna + 2, '-')
                 << "+" << string(max_size + 2, '-')
                 << "+" << string(max_merk + 2, '-') << "+\n";
        }
        // DESTRUCTOR
        ~baju(){
        }

    // GETTER
    string get_size(){
        return size; 
    }
    string get_merk(){
        return merk;
    }

    // SETTER
    void set_size(string size){
        this->size = size;
    }
    void set_merk(string merk){
        this->merk = merk;
    }
};
