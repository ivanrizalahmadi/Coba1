import java.time.LocalDate;

public class SmartOnlineDemo {
    public static void main(String[] args) {

        Produk produk1 = new Produk("P123", "Laptop", 1500000, 5);
        Produk produk2 = new Produk("P998", "Smartphone", 7000000, 10);

        Pelanggan pelanggan1 = new Pelanggan("DXTY242451", "IvanRizal", "Jl. KembangTuri No. 10");

        Pesanan pesanan1 = new Pesanan("O001", LocalDate.now(), pelanggan1);

        pesanan1.tambahProduk(produk1, 2);
        pesanan1.tambahProduk(produk2, 1);

        pelanggan1.tambahPesanan(pesanan1);

        System.out.println(pelanggan1.getInfo());
    }
}
