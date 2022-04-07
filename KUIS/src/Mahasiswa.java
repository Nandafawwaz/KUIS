import beasiswa.BeasiswaMahasiswa;

public class Mahasiswa implements BeasiswaMahasiswa {

    private String nama;
    private double usia;
    private double n1,n2,n3;

    public Mahasiswa(String nama, double usia, double n1, double  n2, double n3) {
        this.nama = nama;
        this.usia = usia;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3
    }

    @Override
    public double hitungNilaiAkhir() {
        return ((n1 * 0.6) + (n2 * 0.25) + (n3 * 0.15));
    }

    public void display() {
        System.out.println("\n");
        System.out.println("+---------+");
        System.out.println("|  HASIL  |");
        System.out.println("+---------+");
        System.out.println("\n");

        System.out.println("\tNilai Akhir\t: " + hitungNilaiAkhir());

        if(hitungNilaiAkhir()) <87.5) {
            System.out.println("\tKETERANGAN\t: TIDAK LOLOS");
            System.out.println("\tMohon maaf, " + nama + " (" +usia + ") dinyatakan tidak diterima pada program BEASISWA PELAJAR karena belum mencapai nilai yang diharapkan pada tahap seleksi");
        } else {
            System.out.println("\tKETERANGAN\t: LOLOS");
            System.out.println("\tMohon maaf, " + nama + " (" +usia + ") dinyatakan diterima pada program BEASISWA PELAJAR karena telah mebcapai nilai yang diharapkan pada tahap seleksi");
        }
    }
}
