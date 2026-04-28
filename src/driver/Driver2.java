package driver;

import java.util.Scanner;

public class Driver2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Membaca Kode Kota
            String kodeKota = sc.next();
            if (kodeKota.equalsIgnoreCase("END")) break;

            // Membaca Berat Paket Butet (x)
            double beratButet = sc.nextDouble();

            // Deklarasi Variabel
            String namaKota = "";
            int ongkosPerKg = 0;
            boolean luarPulau = false;

            // Mapping Data dari Papan Pengumuman
            switch (kodeKota.toUpperCase()) {
                case "MDN":
                    namaKota = "Medan";
                    ongkosPerKg = 8000;
                    luarPulau = false;
                    break;
                case "BLG":
                    namaKota = "Balige";
                    ongkosPerKg = 5000;
                    luarPulau = false;
                    break;
                case "JKT":
                    namaKota = "Jakarta";
                    ongkosPerKg = 12000;
                    luarPulau = true;
                    break;
                case "SBY":
                    namaKota = "Surabaya";
                    ongkosPerKg = 13000;
                    luarPulau = true;
                    break;
            }

            // Perhitungan Berat
            double beratUcok = 1.5 * beratButet;
            double totalBerat = beratButet + beratUcok;
            double totalOngkos = totalBerat * ongkosPerKg;

            // Logika Promo
            String infoPromo = "";
            if (totalBerat > 10) {
                totalOngkos = totalOngkos * 0.9; // Diskon 10%
                infoPromo += "Diskon ongkir 10%";
            }
            
            if (luarPulau) {
                if (!infoPromo.isEmpty()) infoPromo += " & ";
                infoPromo += "Mendapatkan asuransi gratis";
            }

            if (infoPromo.isEmpty()) infoPromo = "-";

            // Output Struk Pembayaran
            System.out.println("--- Struk Pembayaran Del-Express ---");
            System.out.println("Kota Tujuan: " + namaKota);
            System.out.printf("Berat Paket Butet: %.1f kg\n", beratButet);
            System.out.printf("Berat Paket Ucok: %.1f kg\n", beratUcok);
            System.out.printf("Total Berat: %.1f kg\n", totalBerat);
            System.out.printf("Total Ongkos Kirim: Rp %.0f\n", totalOngkos);
            System.out.println("Informasi Promo: " + infoPromo);
            System.out.println();
        }
        
        sc.close();
    }
}