import java.util.Scanner;

/**
 * ini adalah kelas kasir
 */
public class KasirSewaApartemen {
    private String namaPenyewa;
    private int lamaSewa;
    private static final double HARGA_HARIAN = 250000;

    /**
     * ini method kasir
     * @param namaPenyewa penyewanya
     * @param lamaSewa lama sewa
     */
    // Constructor yang menginisialisasi nama penyewa dan lama sewa
    public KasirSewaApartemen(String namaPenyewa, int lamaSewa) {
        this.namaPenyewa = namaPenyewa;
        this.lamaSewa = lamaSewa;
    }

    /**
     * ini method menghitung total harga
     * @return
     */
    // Metode untuk menghitung total harga berdasarkan lama sewa
    public double hitungTotalHarga() {
        return lamaSewa * HARGA_HARIAN;
    }

    /**
     * ini method menampilkan detail penyewaan
     */

    // Metode untuk menampilkan detail sewa
    public void tampilkanDetail() {
        System.out.println("Nama Penyewa: " + namaPenyewa);
        System.out.println("Lama Sewa: " + lamaSewa + " hari");
        System.out.printf("Total Harga: Rp %.2f%n", hitungTotalHarga());
    }

    /**
     * ini method main untuk menjalankan suatu program
     * @param args
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Penyewa: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Lama Sewa (dalam hari): ");
        int lama = input.nextInt();

        KasirSewaApartemen sewa = new KasirSewaApartemen(nama, lama);
        sewa.tampilkanDetail();
    }
}