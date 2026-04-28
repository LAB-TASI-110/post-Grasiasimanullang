package driver;

import java.util.Scanner;

public class Driver3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Sistem POS Kafetaria IT Del ===");
        System.out.print("Nama Pemesan: ");
        String namaPemesan = sc.nextLine();
        
        double grandTotal = 0;
        String daftarPesanan = "";

        while (true) {
            System.out.print("Input Menu (atau '---' untuk selesai): ");
            String menu = sc.next();
            
            // Berhenti jika input adalah ---
            if (menu.equals("---")) break;
            
            System.out.print("Jumlah Pesanan: ");
            int jumlah = sc.nextInt();
            
            int harga = 0;
            
            // Logika Penentuan Harga
            switch (menu.toLowerCase()) {
                case "gorengan": harga = 2000; break;
                case "salad":    harga = 15000; break;
                case "burger":   harga = 20000; break;
                case "kopi":     harga = 5000; break;
                case "teh":      harga = 3000; break;
                default:
                    System.out.println("Menu tidak tersedia!");
                    continue;
            }
            
            int subTotal = harga * jumlah;
            grandTotal += subTotal;
            
            // Menyimpan string untuk output akhir
            daftarPesanan += menu + " | " + jumlah + " | " + subTotal + "\n";
        }

        // Output Struk sesuai format
        System.out.println("\n====================================");
        System.out.println("      STRUK KAFETARIA IT DEL        ");
        System.out.println("====================================");
        System.out.println("Nama Pemesan | " + namaPemesan);
        System.out.println("------------------------------------");
        System.out.println("Menu | Qty | Subtotal");
        System.out.print(daftarPesanan);
        System.out.println("------------------------------------");
        System.out.println("TOTAL PESANAN | Rp " + (int)grandTotal);
        System.out.println("====================================");
        
        sc.close();
    }
}