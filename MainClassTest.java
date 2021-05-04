import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetLocalNumber() {
        int expected = 15;
        Assert.assertTrue("Not equal to 14", actual == expected);
    }
}
