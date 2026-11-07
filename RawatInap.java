public class RawatInap extends Pasien implements Pemeriksaan, Pembayaran {
    private static final double biayaperhari = 300000;
    private final int lamamenginap;
    private boolean sudahbayar = false;

    public RawatInap(String nomor, String nama, int hari, boolean sudahbayar){
        super(nomor, nama, "Menunggu", sudahbayar);
        this.lamamenginap = hari;
    }

    public int getlamamenginap(){
        return lamamenginap;
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
        return biayaperhari * lamamenginap;
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
        System.out.println("Jenis         : Rawat Inap");
        System.out.println("Lama Menginap : " + lamamenginap + " hari");
        System.out.println("Biaya         : Rp" + (long) hitungbiaya());
    }
}
