public class RumahSakit {
    private Pasien[] daftarpasien = new Pasien[2];
    public void jalankan(){
        daftarpasien[0] = new RawatJalan("RM001", "Rusdi", true);
        daftarpasien[1] = new RawatInap("RM002", "Bersiaplah", 3, false);

        System.out.println(Pasien.NAMA_RS);
        for (int i = 0; i < daftarpasien.length; i ++){
            System.out.println("\nData Pasien " + (i + 1));
            daftarpasien[i].tampilkanInfo();
        }
        
        System.out.println("\nPEMERIKSAAN");
        for (int i = 0; i < daftarpasien.length; i++){
            Pemeriksaan pasien = (Pemeriksaan) daftarpasien[i];
            pasien.periksa();
            pasien.periksa();
            System.out.println("Nama   : " + daftarpasien[i].getNama());
            System.out.println("Status : " + daftarpasien[i].getStatus());
        }

        System.out.println("\nPEMBAYARAN");
        for (int i = 0; i < daftarpasien.length; i++) {
            Pembayaran pembayaran = (Pembayaran) daftarpasien[i];
            System.out.println("Nama             : " + daftarpasien[i].getNama());
            System.out.println("Total            : Rp" + (long) pembayaran.hitungbiaya());
            if (daftarpasien[i].getStatus().equals("Selesai Diperiksa")) {
                if (daftarpasien[i].isstatusbayar()) {
                    pembayaran.bayar();
                } else {
                    System.out.println("Pembayaran belum dilakukan");
                }
            } else {
                System.out.println("Pemeriksaan belum selesai.");
            }
            System.out.println("Status Pembayaran : " + daftarpasien[i].getStatuslunas());
            System.out.println();
        }
    }
}
