public class Perangkat {
    private String nama;
    private String jenis;

    // Constructor
    public Perangkat(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    // Method polymorphism
    public void infoPerangkat() {
        System.out.println("Nama: " + nama + ", Jenis: " + jenis);
    }
}
