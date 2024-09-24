import java.util.ArrayList;

public class Pelanggan {
    private String idPelanggan;
    private String nama;
    private String alamat;
    private ArrayList<Pesanan> riwayatPesanan;

    public Pelanggan(String idPelanggan, String nama, String alamat) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.alamat = alamat;
        this.riwayatPesanan = new ArrayList<>();
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void tambahPesanan(Pesanan pesanan) {
        riwayatPesanan.add(pesanan);
    }

    public String getInfo() {
        String info = "ID Pelanggan: " + idPelanggan + ", Nama: " + nama + ", Alamat: " + alamat
                + "\nRiwayat Pesanan:\n";
        for (Pesanan pesanan : riwayatPesanan) {
            info += pesanan.getInfo() + "\n";
        }
        return info;
    }
}
