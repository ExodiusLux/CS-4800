import org.example.IdleState;
import org.example.VendingMachine;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class VendingMachineTest {
    VendingMachine vendingMachine = new VendingMachine();

    @Test
    public void testSelectSnack(){
        vendingMachine.setSelectedSnack("Pepsi");
        String expected = "Pepsi";
        String actual = vendingMachine.getSelectedSnack();
        assertEquals(expected, actual);
    }
    @Test
    public void testCurrentBalance(){
        vendingMachine.setCurrentBalance(2.0);
        double expected = 2.0;
        double actual = vendingMachine.getCurrentBalance();
        assertEquals(expected,actual);
    }
}
