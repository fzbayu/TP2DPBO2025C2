#include <bits/stdc++.h>
#include <iostream>
#include <string>
#include "petshop.cpp"

using namespace std;

class aksesoris : public petshop
{
    private:
        string jenis;
        string bahan;
        string warna;
    
    // CONSTRUCTOR
    public:
        aksesoris(){
            this->jenis = "";
            this->bahan = "";
            this->warna = "";
        }

        aksesoris(string id, string nama_produk, int harga_produk, int stok_produk, string jenis, string bahan, string warna) 
        : petshop(id, nama_produk, harga_produk, stok_produk)
        {
            this->jenis = jenis;
            this->bahan = bahan;
            this->warna = warna;
        }

        // DESTRUCTOR
        ~aksesoris(){
        }

    // GETTER
    string get_jenis(){
        return jenis; 
    }
    string get_bahan(){
        return bahan;
    }
    string get_warna(){
        return warna;
    }

    // SETTER
    void set_jenis(string jenis){
        this->jenis = jenis;
    }
    void set_bahan(string bahan){
        this->bahan = bahan;
    }
    void set_warna(string warna){
        this->warna = warna;
    }
};
