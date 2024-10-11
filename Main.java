public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        PlayStation ps5 = new PlayStation("PlayStation 5", "Konsol", "PS5");
        Kontroler kontroler = new Kontroler("DualSense", "Kontroler", "Wireless");
        Game game = new Game("Spider-Man: Miles Morales");

        Rental rental = new Rental(game, ps5);

        // Menampilkan informasi rental
        rental.infoRental();
    }
}
