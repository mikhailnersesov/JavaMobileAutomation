import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass{
    @Test
    public void testGetClassString(){

        String expected = "Hello";
        String expected2 = "hello";
        Assert.assertTrue(
                "Does not match Hello or hello",
                getClassString().contains(expected)  || getClassString().contains(expected2)
        );

    }
}
