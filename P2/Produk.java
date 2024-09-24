import java.util.ArrayList;

public class Produk {
    private String idProduk;
    private String namaProduk;
    private double harga;
    private int stok;

    public Produk(String idProduk, String namaProduk, double harga, int stok) {
        this.idProduk = idProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    public String getIdProduk() {
        return idProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void kurangiStok(int jumlah) {
        if (jumlah <= stok) {
            stok -= jumlah;
        } else {
            System.out.println("Stok tidak mencukupi");
        }
    }

    public String getInfo() {
        return "ID Produk: " + idProduk + ", Nama: " + namaProduk + ", Harga: " + harga + ", Stok: " + stok;
    }
}
