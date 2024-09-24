import java.time.LocalDate;

public class RumahSakitDemo {

    public static void main(String[] args) {
        pegawai ani = new pegawai("1234", "dr. Ani");
        pegawai bagus = new pegawai("4567", "dr. Bagus");

        pegawai desi = new pegawai("1234", "Ns. Desi");
        pegawai eka = new pegawai("4567", "Ns. Eka");

        pasien pasien1 = new pasien("Puspa Widya", "343298");
        pasien1.tambahKonsultasi(LocalDate.of(2021, 8, 11), ani, desi);
        pasien1.tambahKonsultasi(LocalDate.of(2021, 9, 11), bagus, eka);

        System.out.println(pasien1.getInfo());

        pasien pasien2 = new pasien("Yenni Anggraeni", "997744");
        System.out.println(pasien2.getInfo());

    }

}
