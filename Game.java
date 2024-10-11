public class Game {
    private String judul;

    // Constructor
    public Game(String judul) {
        this.judul = judul;
    }

    // Getter dan Setter
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    // Method polymorphism
    public void infoGame() {
        System.out.println("Judul Game: " + judul);
    }
}
