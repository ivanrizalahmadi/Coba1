import java.time.LocalDate;
import java.util.ArrayList;

public class Pesanan {
    private String idPesanan;
    private LocalDate tanggalPesanan;
    private Pelanggan pelanggan;
    private ArrayList<Produk> daftarProduk;

    public Pesanan(String idPesanan, LocalDate tanggalPesanan, Pelanggan pelanggan) {
        this.idPesanan = idPesanan;
        this.tanggalPesanan = tanggalPesanan;
        this.pelanggan = pelanggan;
        this.daftarProduk = new ArrayList<>();
    }

    public String getIdPesanan() {
        return idPesanan;
    }

    public LocalDate getTanggalPesanan() {
        return tanggalPesanan;
    }

    public void tambahProduk(Produk produk, int jumlah) {
        if (produk.getStok() >= jumlah) {
            produk.kurangiStok(jumlah);
            daftarProduk.add(produk);
        } else {
            System.out.println("Stok produk tidak mencukupi untuk ditambahkan ke pesanan.");
        }
    }

    public String getInfo() {
        String info = "ID Pesanan: " + idPesanan + ", Tanggal: " + tanggalPesanan + "\nProduk yang dipesan:\n";
        for (Produk produk : daftarProduk) {
            info += produk.getInfo() + "\n";
        }
        return info;
    }
}
