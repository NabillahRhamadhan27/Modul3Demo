# Kasir Sewa Apartemen

## Deskripsi
Program **Kasir Sewa Apartemen** ini dirancang untuk menghitung total biaya sewa apartemen berdasarkan nama penyewa dan durasi sewa. Program ini menggunakan konsep pemrograman berorientasi objek (OOP) dalam Java, dengan fokus pada penggunaan kelas, metode, dan atribut.

## Fitur Utama
- **Input Data Penyewa:** Program meminta pengguna untuk memasukkan nama penyewa dan lama sewa dalam hari.
- **Perhitungan Otomatis:** Program secara otomatis menghitung total biaya berdasarkan durasi sewa dan harga harian.
- **Tampilan Rincian Sewa:** Program menampilkan informasi lengkap tentang penyewa, lama sewa, dan total biaya.

## Struktur Program
1. **Kelas `KasirSewaApartemen`**
    - Menyimpan informasi penyewa, lama sewa, dan harga sewa harian.
    - Memiliki metode untuk menghitung total harga dan menampilkan detail penyewaan.

2. **Metode Utama:**
    - **`hitungTotalHarga`**: Menghitung total biaya berdasarkan lama sewa.
    - **`tampilkanDetail`**: Menampilkan detail penyewaan ke layar.

3. **Fungsi `main`**:
    - Mengambil input pengguna untuk nama penyewa dan lama sewa.
    - Membuat objek `KasirSewaApartemen` dan memanggil metode untuk menampilkan detail penyewaan.

## Cara Kerja Program
1. Program meminta pengguna untuk memasukkan:
    - Nama penyewa.
    - Lama sewa dalam hari.
2. Program menghitung total biaya sewa berdasarkan formula:
   ```
   Total Harga = Lama Sewa x Harga Harian
   ```
3. Program menampilkan detail penyewaan, termasuk:
    - Nama penyewa.
    - Lama sewa.
    - Total biaya sewa.

## Contoh Output
**Input:**
```
Masukkan Nama Penyewa: John Doe
Masukkan Lama Sewa (dalam hari): 3
```

**Output:**
```
Nama Penyewa: John Doe
Lama Sewa: 3 hari
Total Harga: Rp 750000.00
```

## Harga Sewa Harian
Harga sewa harian ditetapkan sebagai **Rp 250,000** dan disimpan dalam konstanta `HARGA_HARIAN`.

## Teknologi yang Digunakan
- **Bahasa Pemrograman:** Java
- **IDE:** IntelliJ IDEA, Eclipse, atau lainnya yang mendukung Java.
- **Input/Output:** Menggunakan `Scanner` untuk input pengguna dan `System.out` untuk output ke layar.

## Catatan
- Pastikan input untuk lama sewa adalah bilangan bulat.
- Program ini menggunakan format angka dengan dua desimal untuk menampilkan total harga.

---

Terima kasih telah menggunakan program ini! 😊

