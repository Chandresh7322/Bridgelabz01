package OOPS;
class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    void bookTicket(String movie, int seat, double ticketPrice) {
        movieName = movie;
        seatNumber = seat;
        price = ticketPrice;
        System.out.println("Ticket booked successfully!");
    }

    void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Ticket Price: ₹" + price);
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        ticket.bookTicket("Avengers: Endgame", 15, 250.00);
        ticket.displayDetails();
    }
}
