package model;

public class Model1 {
    public class Paket {
    private String kodeKota;
    private double beratButet;

    public Paket(String kodeKota, double beratButet) {
        this.kodeKota = kodeKota;
        this.beratButet = beratButet;
    }

    public double getBeratUcok() {
        return 1.5 * this.beratButet;
    }

    public double getTotalBerat() {
        return this.beratButet + getBeratUcok();
    }

    public boolean isLuarPulau() {
        return kodeKota.equalsIgnoreCase("JKT") || kodeKota.equalsIgnoreCase("SBY");
    }

    public int getHargaPerKg() {
        switch (kodeKota.toUpperCase()) {
            case "MDN": return 8000;
            case "BLG": return 5000;
            case "JKT": return 12000;
            case "SBY": return 13000;
            default: return 0;
        }
    }
}
}