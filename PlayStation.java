public class PlayStation extends Perangkat {
    private String versi;

    // Constructor overloading
    public PlayStation(String nama, String jenis, String versi) {
        super(nama, jenis);
        this.versi = versi;
    }

    // Getter dan Setter
    public String getVersi() {
        return versi;
    }

    public void setVersi(String versi) {
        this.versi = versi;
    }

    // Method overriding
    @Override
    public void infoPerangkat() {
        super.infoPerangkat();
        System.out.println("Versi: " + versi);
    }
}
