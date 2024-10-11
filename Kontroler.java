public class Kontroler extends Perangkat {
    private String tipe;

    // Constructor
    public Kontroler(String nama, String jenis, String tipe) {
        super(nama, jenis);
        this.tipe = tipe;
    }

    // Getter dan Setter
    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    // Method overriding
    @Override
    public void infoPerangkat() {
        super.infoPerangkat();
        System.out.println("Tipe: " + tipe);
    }
}
