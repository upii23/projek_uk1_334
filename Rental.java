public class Rental {
    private Game game;
    private PlayStation playStation;

    // Constructor
    public Rental(Game game, PlayStation playStation) {
        this.game = game;
        this.playStation = playStation;
    }

    // Method untuk menampilkan informasi rental
    public void infoRental() {
        System.out.println("Informasi Rental:");
        playStation.infoPerangkat();
        game.infoGame();
    }
}
