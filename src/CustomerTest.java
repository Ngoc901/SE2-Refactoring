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

    @Test
    public void testChildrensMovieStatement() {
        Movie movie = new Movie("Toy Story", Movie.CHILDRENS);
        Rental rental = new Rental(movie, 4);
        Customer customer = new Customer("Liam");
        customer.addRental(rental);

        String result = customer.statement();

        assertTrue(result.contains("Liam"));
        assertTrue(result.contains("Toy Story"));
        assertTrue(result.contains("3.0"));
    }

    @Test
    public void testNewReleaseMovieStatement() {
        Movie movie = new Movie("Interstellar", Movie.NEW_RELEASE);
        Rental rental = new Rental(movie, 2);
        Customer customer = new Customer("Sara");
        customer.addRental(rental);

        String result = customer.statement();

        assertTrue(result.contains("Sara"));
        assertTrue(result.contains("Interstellar"));
        assertTrue(result.contains("6.0"));
    }
}
