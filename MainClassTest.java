import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetClassNumber() {
        Assert.assertTrue("Is not more than 45", getClassNumber() > 45);
    }
}
