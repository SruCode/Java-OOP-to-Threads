/*
 * Exception Handling Example in Java
 *
 * Concepts Demonstrated:
 * 1. Custom Exception
 * 2. throw Keyword
 * 3. throws Keyword
 * 4. try-catch Block
 * 5. Real-world Movie Ticket Booking Scenario
 */

public class ExceptionHandlingDemo {

    public static void main(String[] args) {

        Movie movie = new Movie(20);

        try {
            movie.bookSeats(10);
            movie.bookSeats(30);
        }
        catch (SeatNotAvailableException e) {
            System.out.println("Booking Failed: " + e.getMessage());
        }
        finally {
            System.out.println("Transaction Completed.");
        }

        System.out.println("Program Ended.");
    }
}

// Custom Exception Class
class SeatNotAvailableException extends Exception {

    public SeatNotAvailableException(String message) {
        super(message);
    }
}

// Movie Class
class Movie {

    private int availableSeats;

    public Movie(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    // Method using throws keyword
    public void bookSeats(int seatsRequested)
            throws SeatNotAvailableException {

        if (seatsRequested > availableSeats) {

            // Using throw keyword
            throw new SeatNotAvailableException(
                    "Requested seats exceed available seats."
            );
        }

        availableSeats -= seatsRequested;

        System.out.println(seatsRequested + " seat(s) booked successfully.");
        System.out.println("Remaining Seats: " + availableSeats);
    }
}