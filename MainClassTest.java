import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass{
    @Test
    public void testGetClassString(){

        String expected = "Hello";
        Assert.assertTrue("Does not match Hello or hello",getClassString().toLowerCase().contains(expected.toLowerCase()));

        /*
        my tryouts, interesting to look at the end of the course:

        String b = getClassString().toLowerCase();
        System.out.println(b);

        Assert.assertTrue("Does not match Hello or hello","hello, world".equalsIgnoreCase(getClassString()));

        Assert.assertTrue(boolean containsIgnoreCase("hello, world", getClassString()));
        String toLowerCase("Hello");
        Assert.assertTrue("Does not match Hello or hello",getClassString().contains(expected));
         */
    }
}
