import java.time.LocalDate;

public class konsultasi {
    private LocalDate tanggal;
    private pegawai dokter;
    private pegawai perawat;

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public pegawai getDokter() {
        return dokter;
    }

    public void setDokter(pegawai dokter) {
        this.dokter = dokter;
    }

    public pegawai getPerawat() {
        return perawat;
    }

    public void setPerawat(pegawai perawat) {
        this.perawat = perawat;
    }

    public String getInfo() {
        String info = "";
        info += "\tTanggal: " + tanggal;
        info += ", Dokter: " + dokter.getInfo();
        info += ", Perawat: " + perawat.getInfo();
        info += "\n";

        return info;
    }

}
