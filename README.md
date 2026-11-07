# Responsi Pemrograman Berbasis Objek

Nama : Muhammad Akbar NurFauzi  
NIM : H1D025166  
SHIFT AWAL :   
SHIFT AKHIR : B  

# Tema Sistem Rumah Sakit
## Alur Program

1. Program dijalankan melalui class Main.java class ini membuat objek RumahSakit kemudian memanggil method jalankan() yang ada di dalam Class RumahSakit
2. Di dalam class RumahSakit program membuat dua objek pasien
    Pasien pertama bernama Budi dengan jenis perawatan RawatJalan
    Pasien kedua bernama Ani dengan jenis perawatan RawatInap selama 3 hari
3. Program ini menampilkan informasi setiap pasien yaitu:  
       1. Nomor rekam medis  
       2. Nama Pasien  
       3. Status Pasien  
       4. Jenis Perawatan  
       5. Biaya Perawatan  
   Method tampilkanInfo() digunakan untuk menampilkan informasi dasar dan informasi tambahan sesuai jenis perawatan masing masing pasien
4. Program ini memiliki interface Pemeriksaan untuk menjalankan pemeriksaan pasien. Setiap pasien menjalani dua tahap perubahan status  
       1. Status Menunggu berubah menjadi Diperiksa  
       2. Status Diperiksa berubah menjadi Selesai  
   Perubahan status dilakukan melalui method prosesPelayanan() menggunakan percabangan if-else
5. Setelah pemeriksaan dilakukan dan selesai program menghitung biaya pemeriksaan melalui interface Pembayaran
   Ketentuan biaya itu sendiri  
       1. Rawat Jalan : Rp150.000  
       2. Rawat Inap  : Rp300.000/hari  
   Selanjutnya method bayar() dijalankan jika pemeriksaan sudah selesai tetapi pasien belum membayar, pembayaran berhasil diproses dan status pasien berubah menjadi Lunas
6. Setelah pembayaran selesai program menampilkan kembali informasi setiap pasien untuk menunjukkan status akhir jika kedua pasien telah membayar dan pembayaran berhasil maka kedua pasien tersebut akan memiliki status Lunas

## Fitur Program

1. Menampilkan informasi pasien
2. Membedakan pasien rawat jalan dan rawat inap
3. Melakukan simulasi pemeriksaan pasien
4. Mengubah status pasien berdasarkan proses pelayanan
5. Menghitung biaya rawat jalan dan rawat inap
6. Memproses pembayaran pasien
7. Menampilkan status akhir pasien setelah pembayaran

# Cara Menjalankan Program
## 1. Compile Program
```bash
javac *.java
```
## 2. Jalankan Program
```bash
java Main
```
# Hasil Output
![Image](https://cdn.discordapp.com/attachments/1304457363109056632/1568581748764311764/image.png?ex=6af05717&is=6aef0597&hm=263128bf7fc4a149b8c1e6948a4645efd3a6693c3e81e2d4fd1121ea6d4b18b7)
