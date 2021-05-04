import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest extends CoreTestCase {
    public static int actual = 14;
    @Test
    public void getLocalNumber(){
        System.out.println(actual);
    }

    public void typeStartMessage() {
        super.typeStartMessage();
        /*
         сначала выполнятся все действия в родительском класса
         а потом приступим к коду в текущем классе
         */
        System.out.println("Current class is MainText");
    }

    /*
     нужен, так как родительский может и не знать обо всех детях
     и не покажет нам класс в котором выполняется конкретный метод

     Мы создали новый метод, где вначале обращаемся к методу из род класса
     а затем делаем свой код
     */
    /*
    @Test
    public void myFirstTest() {
        this.typeStartMessage();
    }

    @Test
    public void mySecondTest() {
        this.typeStartMessage();
    }

    @Before
    public void textStartTest() {
        System.out.println("Start the test");
    }

    @After
    public void textAfterTest(){
        System.out.println("Finish the test");
    }

    @Test
    public void firstTest() {
        //Assert.fail("This message will be printed");
        int expected = 25;
        int actual = 5 * 5;

        Assert.assertTrue("5*5 !=25", actual == expected);
        System.out.println("firsttest");
    }

    @Test
    public void secondTest(){
        System.out.println("secondtest");
    }
*/
}
class MainClassTest{
    int a;
    @Test
    public void testGetLocalNumber(){
        this.actual = actual;
        Assert.assertTrue( "Is not equal to 14",actual == expected);
    }
}
