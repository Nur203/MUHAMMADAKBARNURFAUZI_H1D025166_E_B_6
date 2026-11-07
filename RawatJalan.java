public class RawatJalan extends Pasien implements Pemeriksaan, Pembayaran {
    private static final double biaya = 150000;
    private boolean sudahbayar = false;

    public RawatJalan(String nomor, String nama, boolean sudahbayar) {
        super(nomor, nama, "Menunggu", sudahbayar);
    }

    @Override
    public void prosesPelayanan(){
        if(getStatus().equals("Menunggu")){
            setStatus("Diperiksa");
        } else if (getStatus().equals("Diperiksa")){
            setStatus("Selesai Diperiksa");
        }
    }

    @Override
    public void periksa(){
        prosesPelayanan();
    }

    @Override
    public double hitungbiaya(){
        return biaya;
    }

    @Override
    public void bayar(){
        if (getStatus().equals("Selesai Diperiksa") && getStatuslunas().equals("Belum Lunas")){
            setstatuslunas("Lunas");
            System.out.println("Pembayaran berhasil");
        } else if (getStatuslunas().equals("Lunas")){
            System.out.println("Pasien sudah membayar");
        } else {
            System.out.println("Pemeriksaan belum selesai");
        }
    }

    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Jenis         : Rawat Jalan");
        System.out.println("Biaya         : Rp" + hitungbiaya());
    }
}