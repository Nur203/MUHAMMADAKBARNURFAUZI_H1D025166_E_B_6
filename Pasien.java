public abstract class Pasien {
    public static final String NAMA_RS = "RS NGAWI";
    private final String nomorRM;
    private final boolean statusbayar;
    private String nama;
    private String status;
    private String statuslunas;

    //Constructor pasien pertama
    public Pasien(String nomorRM, String nama) {
        this.nomorRM = nomorRM;
        this.nama = nama;
        this.status = "Menunggu";
        this.statuslunas = "Belum Lunas";
        this.statusbayar = true;
    }

    //Constructor pasien kedua
    public Pasien(String nomorRM, String nama, String status, boolean statusbayar){
        this.nomorRM = nomorRM;
        this.nama = nama;
        this.status = status;
        this.statuslunas = "Belum Lunas";
        this.statusbayar = statusbayar;
    }

    //Getter
    public String getNomorRM(){
        return nomorRM;
    }
    public String getNama(){
        return nama;
    }
    public String getStatus(){
        return status;
    }
    public String getStatuslunas(){
        return statuslunas;
    }
    public boolean isstatusbayar(){
        return statusbayar;
    }

    //Setter
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public void setstatuslunas(String statuslunas){
        this.statuslunas = statuslunas;
    }

    //Menampilkan informasi pasien
    public void tampilkanInfo(){
        System.out.println("Nomor RM         : " + nomorRM);
        System.out.println("Nama             : " + nama);
        System.out.println("Status           : " + status);
        System.out.println("Status Pembayarn : " + statuslunas);
    }

    //Abstract method
    public abstract  void prosesPelayanan();
}
