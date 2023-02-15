package source_code.labsheet_7;

public class Movie {
    interface Bookable {
        public void printTicket();

        public void giveTicket(String movie);
    }

    public void bookTheTicket() {

        // Inner class that implements the above interface
        class EnglishMovie implements Bookable {
            String name;

            @Override
            public void printTicket() {
                giveTicket("BlindDate");
            }

            @Override
            public void giveTicket(String movie) {
                name = movie;
                System.out.println("You have booked a ticket for the movie: " + name);
            }
        }
        Bookable hollywood = new EnglishMovie();

        // Anonymous Inner class
        Bookable bollywood = new Bookable() {
            String name;

            @Override
            public void printTicket() {
                giveTicket("M S Dhoni");
            }

            @Override
            public void giveTicket(String movie) {
                name = movie;
                System.out.println("You have booked a ticket for the movie: " + name);
            }
        };

        hollywood.printTicket();
        bollywood.printTicket();
    }

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.bookTheTicket();
    }

}
