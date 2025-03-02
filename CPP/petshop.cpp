#include <bits/stdc++.h>
#include <iostream>
#include <string>

using namespace std;

class petshop{
    private:
        string id;
        string nama_produk;
        int harga_produk;
        int stok_produk;

    // CONSTRUCTOR
    public:
        petshop(){
            this->id = "";
            this->nama_produk = "";
            this->harga_produk = 0;
            this->stok_produk = 0;
        }

        petshop(string id, string nama_produk, int harga_produk, int stok_produk){
            this->id = id;
            this->nama_produk = nama_produk;
            this->harga_produk = harga_produk;
            this->stok_produk = stok_produk;
        }

        // DESTRUCTOR
        ~petshop(){
        }

    // GETTER
    string get_id(){
        return id; 
    }

    string get_nama_produk(){
        return nama_produk; 
    }

    int get_harga_produk(){
        return harga_produk; 
    }

    int get_stok_produk(){
        return stok_produk; 
    }

    // SETTER
    void set_id(int id){
        this->id = id;
    }

    void set_nama_produk(string nama_produk){
        this->nama_produk = nama_produk;
    }

    void set_harga_produk(int harga_produk){
        this->harga_produk = harga_produk;
    }
    void set_stok_produk(int stok_produk){
        this->stok_produk = stok_produk;
    }
};
