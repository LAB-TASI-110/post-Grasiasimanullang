package model;

public class Model3 {
	public class Pesanan {
    private String namaMenu;
    private int jumlah;
    private int hargaSatuan;

    public Pesanan(String namaMenu, int jumlah) {
        this.namaMenu = namaMenu;
        this.jumlah = jumlah;
        setHargaBerdasarkanMenu();
    }

    private void setHargaBerdasarkanMenu() {
        switch (namaMenu.toLowerCase()) {
            case "gorengan": this.hargaSatuan = 2000; break;
            case "salad":    this.hargaSatuan = 15000; break;
            case "burger":   this.hargaSatuan = 20000; break;
            case "kopi":     this.hargaSatuan = 5000; break;
            case "teh":      this.hargaSatuan = 3000; break;
            default:         this.hargaSatuan = 0; break;
        }
    }

    public int getSubTotal() {
        return this.hargaSatuan * this.jumlah;
    }

    public String getFormatStruk() {
        return namaMenu + " | " + jumlah + " | " + getSubTotal();
    }
}
}
