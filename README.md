# Responsi Pemrograman Berbasis Objek

Nama : Muhammad Akbar NurFauzi  
NIM : H1D025166  
SHIFT AWAL : E   
SHIFT AKHIR : B  

## Tema Sistem Rumah Sakit
### Alur Program

1. Program dijalankan melalui class Main.java class ini membuat objek RumahSakit kemudian memanggil method jalankan() yang ada di dalam Class RumahSakit
2. Di dalam class RumahSakit program membuat dua objek pasien
    * Pasien pertama bernama Rusdi dengan jenis perawatan RawatJalan
    * Pasien kedua bernama Bersiaplah dengan jenis perawatan RawatInap selama 3 hari
3. Menampilkan informasi setiap pasien:  
    * Nomor Rekam Medis
    * Nama Pasien
    * Status Pemeriksaan (default = Menunggu)
    * Status Pembayaran (default = Belum Lunas)
    * Jenis Perawatan (Rawat Jalan / Rawat Inap)
    * Lama Menginap
    * Total Biaya
   Informasi ini ditampilkan memanfaatkan method tampilkanInfo() yang dioverride di masing masing subclass.
4. Program ini menggunakan interface Pemeriksaan untuk menjalankan pemeriksaan pasien. Setiap pasien menjalani dua tahap perubahan status
    * Status Menunggu berubah menjadi Diperiksa
    * Status Diperiksa berubah menjadi Selesai Diperiksa
   Perubahan status dilakukan melalui method prosesPelayanan() menggunakan percabangan if-else
5. Setelah pemeriksaan dilakukan dan selesai program menghitung biaya pemeriksaan melalui interface Pembayaran
   Ketentuan biaya itu sendiri
   * Rawat Jalan : Rp150.000
   * Rawat Inap : Rp300.000/hari  
   
    Method bayar() akan dipanggil saat status pemeriksaan pasien bernilai "Selesai Diperiksa". 
   * Jika status bayar bernilai true (seperti pada pasien Rusdi), pembayaran berhasil diproses dan atribut statuslunas diperbarui menjadi "Lunas".
   * Jika bernilai false (seperti pada pasien Bersiaplah), program menampilkan pesan "Pembayaran belum dilakukan" dan status tetap "Belum Lunas".
6. Setelah pembayaran selesai program mencetak rekapitulasi akhir pembayaran dengan format yang rapi dan sejajar untuk memverifikasi apakah status pembayaran pasien sudah terbarui dengan benar.

### Fitur Program

1. Menampilkan informasi pasien
2. Membedakan pasien rawat jalan dan rawat inap
3. Melakukan simulasi pemeriksaan pasien
4. Mengubah status pasien berdasarkan proses pelayanan
5. Menghitung biaya rawat jalan dan rawat inap
6. Memproses pembayaran pasien
7. Menampilkan status akhir pasien setelah pembayaran

## Cara Menjalankan Program
### 1. Compile Program
```bash
javac *.java
```
### 2. Jalankan Program
```bash
java Main
```
## Hasil Output
![Image](https://cdn.discordapp.com/attachments/1304457363109056632/1568605031438090352/image.png?ex=6af06cc6&is=6aef1b46&hm=ca796e02e41d3cddb8e4aa3ff61a6e37be01d88a53db6a726f116dbec35774db)
