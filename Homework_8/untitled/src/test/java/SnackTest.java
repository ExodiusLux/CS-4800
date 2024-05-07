import org.example.Snack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class SnackTest {
    Snack snack = new Snack("test", 1.0, 5);
    @Test
    public void setNameTest(){
        snack.setName("Chips");
        String expected = "Chips";
        String acutal = snack.getName();
        assertEquals(expected,acutal);
    }

    @Test
    public void setPriceTest(){
        snack.setPrice(2.0);
        double expected = 2.0;
        double actual = snack.getPrice();
        assertEquals(expected,actual);
    }

    @Test
    public void setQuantityTest(){
        snack.setQuantity(10);
        int expected = 10;
        int actual = snack.getQuantity();
    }
}
