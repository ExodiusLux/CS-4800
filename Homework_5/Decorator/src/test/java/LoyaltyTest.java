import junit.framework.TestFailure;
import org.example.LoyaltyStatus;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class LoyaltyTest {
    LoyaltyStatus LoyaltyTrue = new LoyaltyStatus(true);
    LoyaltyStatus LoyaltyFalse = new LoyaltyStatus(false);

    @Test
    public void TestLoyaltyTrue(){
        boolean expected = true;
        boolean actual = LoyaltyTrue.getStatus();
        if( expected == actual){
            System.out.println("Passed Test");
        }
        else{
            System.out.println("Failed Test");
        }
    }
    @Test
    public void TestLoyaltyFalse(){
        boolean expected = false;
        boolean actual = LoyaltyFalse.getStatus();
        if( expected == actual){
            System.out.println("Passed Test");
        }
        else{
            System.out.println("Failed Test");
        }
    }

    @Test
    public void TestLoyaltySetFalse(){
        boolean expected = false;
        LoyaltyTrue.setMember(false);
        boolean actual = LoyaltyTrue.getStatus();
        if( expected == actual){
            System.out.println("Passed Test");
        }
        else{
            System.out.println("Failed Test");
        }
    }
    @Test
    public void TestLoyaltySetTrue(){
        boolean expected = true;
        LoyaltyFalse.setMember(true);
        boolean actual = LoyaltyTrue.getStatus();
        if( expected == actual){
            System.out.println("Passed Test");
        }
        else{
            System.out.println("Failed Test");
        }
    }

}
