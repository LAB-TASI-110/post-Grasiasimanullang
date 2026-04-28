package driver;

	import java.util.Scanner;

public class Driver1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Input: Jumlah total data (N)
        int n = sc.nextInt();

        // Inisialisasi array untuk menyimpan deret stok dan kategori
        int[] stokBarang = new int[n];
        String[] kategoriBarang = new String[n];

        // 2. Input: Deret stok (s1, s2, ..., sN) 
        // Diasumsikan input stok berpasangan dengan kategorinya atau sesuai urutan
        for (int i = 0; i < n; i++) {
            stokBarang[i] = sc.nextInt();
            kategoriBarang[i] = sc.next(); // Contoh: "Sekolah" atau "Sembako"
        }

        // 3. Input: Kode kategori barang yang ingin dicari totalnya
        String targetKategori = sc.next();

        int totalStok = 0;

        // Proses Filter dan Penjumlahan
        for (int i = 0; i < n; i++) {
            if (kategoriBarang[i].equalsIgnoreCase(targetKategori)) {
                totalStok += stokBarang[i];
            }
        }

        // Output hasil sesuai permintaan
        System.out.println(totalStok);

        sc.close();
    }
}
