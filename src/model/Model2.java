package model;

public class Model2 {
public class Barang {
    private int stok;
    private String kategori;

    public Barang(int stok, String kategori) {
        this.stok = stok;
        this.kategori = kategori;
    }

    public int getStok() {
        return stok;
    }

    public String getKategori() {
        return kategori;
    }
}	
}
