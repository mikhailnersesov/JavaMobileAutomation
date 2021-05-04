import org.junit.Test;

public class MainTestIntroduction extends CoreTestCaseIntroduction {

    int a = 5; // поля класса или instance variable
    int b = 11;

    MathHelper Math = new MathHelper();
    /*
    с помощью слова new создаем новый объект класса MathHelper
    и присваиваем его переменной Math c таким же типом как имя
    нашего класса
     */


    @Test
    public void myFirstTest() { // looks to substitute "main"
        System.out.println("Hello, QA Engineers!");

        int number = 10;
        System.out.println(number);

        int number2 = 10 + 15;
        System.out.println(number2);

        int number3 = 10 / 3;
        System.out.println(number3); // "3" while data type "int"

        double number4 = 10 / 3;
        System.out.println(number4); // "3.0" while data without .0 is "int"

        double number5 = 10.0 / 3.0;
        System.out.println(number5); // "3.333" while input "double"

        int a = 10;
        int b = 15;
        if (a > b) {
            System.out.println("This will never happen");
        } else {
            System.out.println("This is what will happen");
        }

        int a2 = 15;
        int b2 = 10;
        if (a2 > b2) {
            System.out.println("This will never happen");
        } else {
            System.out.println("This is what will happen");
        }

        System.out.println("new test for a with this: " + this.a);
        System.out.println("new test for b with this: " + this.b);

        this.typeString();

        int a3 = this.giveMeInt();
        if (a3 > 10) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }

        int a4 = Math.multiply(5);
        System.out.println(a4);
        if (a4 == 10) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        int b3 = Math.multiply2(10, 15);
        System.out.println(b3);

        int b4 = this.multiplyCoreTestCase(10, 15);
        System.out.println(b4);

    }

    public void typeString() {
        System.out.println("Hello from typeString");
    }

    public int giveMeInt() {
        return 5;
    }

    @Test
    public void mySecondTest() {
        System.out.println("First test before changing static_int: " + MathHelper.static_int);
        MathHelper.static_int = 8;

        MathHelper mathObject = new MathHelper();
        System.out.println("First test before changed simple_int: " + mathObject.simple_int);
        mathObject.simple_int = 8;
    }
    @Test
        public void myThirdTest () {
            System.out.println("Second test before changing static_int: " + MathHelper.static_int);
            // output 8 , while static changes to "8"
            MathHelper.static_int = 8;

            MathHelper mathObject = new MathHelper();
            System.out.println("Second test before changed simple_int: " + mathObject.simple_int);
            // output "7" while is a new object
            mathObject.simple_int = 8;
        }

    }
