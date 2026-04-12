import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void testRegularMovieStatement() {
        Movie movie = new Movie("Titanic", Movie.REGULAR);
        Rental rental = new Rental(movie, 3);
        Customer customer = new Customer("Emma");
        customer.addRental(rental);

        String result = customer.statement();

        assertTrue(result.contains("Emma"));
        assertTrue(result.contains("Titanic"));
        assertTrue(result.contains("3.5"));
    }
}
