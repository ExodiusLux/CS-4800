import org.example.Burger;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class BurgerTest {
    Burger burger = new Burger();

    @Test
    public void Testburgerprice (){
        double expected = 5.0;
        double actual = burger.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void Testburgerdescription(){
        String expected = "Burger";
        String actual= burger.getDescription();
        assertEquals(expected, actual);
    }
}

