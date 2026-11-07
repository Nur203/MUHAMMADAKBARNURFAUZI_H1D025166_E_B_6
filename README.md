# Responsi Pemrograman Berbasis Objek

Nama : Muhammad Akbar NurFauzi  
NIM : H1D025166  
SHIFT AWAL : E   
SHIFT AKHIR : B  

## Tema Sistem Rumah Sakit
### Alur Program

1. **Inisialisasi**  
Program dijalankan melalui class Main.java class ini membuat objek RumahSakit kemudian memanggil method jalankan() yang ada di dalam Class RumahSakit.
2. **Pembuatan Objek Pasien**   
Di dalam class RumahSakit program membuat dua objek pasien.
    * Pasien pertama bernama Rusdi dengan jenis perawatan RawatJalan.
    * Pasien kedua bernama Bersiaplah dengan jenis perawatan RawatInap selama 3 hari.
3. **Informasi Awal Pasien**   
    * Nomor Rekam Medis.
    * Nama Pasien.
    * Status Pemeriksaan. (default = Menunggu)
    * Status Pembayaran. (default = Belum Lunas)
    * Jenis Perawatan. (Rawat Jalan / Rawat Inap)
    * Lama Menginap.
    * Total Biaya.   
   Informasi ini ditampilkan memanfaatkan method tampilkanInfo() yang dioverride di masing masing subclass.
4. **Simulasi Pemeriksaan Pasien**  
Program ini menggunakan interface Pemeriksaan untuk menjalankan pemeriksaan pasien. Setiap pasien menjalani dua tahap perubahan status.
    * Status Menunggu berubah menjadi Diperiksa
    * Status Diperiksa berubah menjadi Selesai Diperiksa
   Perubahan status dilakukan melalui method prosesPelayanan() menggunakan percabangan if else.
5. **Proses Pembayaran**  
Setelah pemeriksaan dilakukan dan selesai program menghitung biaya pemeriksaan melalui interface Pembayaran
   Ketentuan biaya itu sendiri.
   * Rawat Jalan : Rp150.000.
   * Rawat Inap : Rp300.000/hari.  
   
    Method bayar() akan dipanggil saat status pemeriksaan pasien bernilai "Selesai Diperiksa". 
   * Jika status bayar bernilai true (seperti pada pasien Rusdi), pembayaran berhasil diproses dan atribut statuslunas diperbarui menjadi "Lunas".
   * Jika bernilai false (seperti pada pasien Bersiaplah), program menampilkan pesan "Pembayaran belum dilakukan" dan status tetap "Belum Lunas".
6. **Menampilkan Status Akhir**   
Setelah pembayaran selesai program mencetak rekapitulasi akhir pembayaran dengan format yang rapi dan sejajar untuk memverifikasi apakah status pembayaran pasien sudah terbarui dengan benar.

### Fitur Program
Penerapan 10 konsep teknis pada sistem:
1. **State & Behavior**: Menyimpan data pasien dan menyediakan methode aksi/penghitungan biaya.
2. **Immutability**: Menggunakan *public static final* (nama Rumah Sakit) dan *private final* (nomor Rekam Medis & lama inap).
3. **Enkapsulasi & Overloading**: Atribut *private*, *getter/setter*, keyword *this*, serta 2 variasi konstruktor *Pasien*.
4. **Inheritance**: Subclass *RawatJalan* dan *RawatInap* mewarisi superclass *Pasien*.
5. **Super Chaining**: Memanggil *super()* di konstruktor dan *super.tampilkanInfo()* di subclass.
6. **Method Overriding**: Menimpa method superclass dengan *@Override* pada subclass.
7. **Abstract Class**: Class *Pasien* bersifat *abstract* dengan abstract method *prosesPelayanan()*.
8. **Logika State Percabangan**: Menggunakan *if-else* untuk update status pemeriksaan pasien secara dinamis.
9. **Polimorfisme Interface**: Memanggil method via variabel referensi interface *Pemeriksaan* dan *Pembayaran*.
10. **Multiple Interface**: Subclass mengimplementasikan dua interface sekaligus *implements Pemeriksaan, Pembayaran*.

## Cara Menjalankan Program
### 1. Clone Repository Github
```bash
git clone https://github.com/Nur203/RumahSakitSuki
```
### 2. Masuk ke Folder Repository
```bash
cd RumahSakitSuki
```
### 3. Compile Program
```bash
javac *.java
```
### 4. Jalankan Program
```bash
java Main
```
## Hasil Output
![Image](https://cdn.discordapp.com/attachments/1304457363109056632/1568667044487102675/image.png?ex=6af0a687&is=6aef5507&hm=58a2bd70867f3402eaaadc99e89f890aae78c5486e2e5c5ee7a273b1260af9b9)
