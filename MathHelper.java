public class MathHelper {

    // first section of the lesson:
    public int multiply(int number) {
        return number * 2;
    }

    public int multiply2(int number, int multiplier) {
        return number * multiplier;
    }


    /*
    second section of the lesson, first variant:
     */
    public int calc(int a, int b, char action)
    /*
    метод такой громоздкий, что его делят на подметоды
    и так как каждый из них по отдельности "снаружи" не нужен
    их делаем "private"
     */
    /*{
        if (action == '+') {
            return a + b;
        } else if (action == '-') {
            return a - b;
        } else if (action == '*') {
            return a * b;
        } else if (action == '/') {
            if (b == 0) {
                System.out.println("Can not divide by: " + b);
                return 0;
            }
            return a / b;
        } else {
            System.out.println("Wrong action: " + action);
            return 0;
        }
    }
    */

    // first variant improved:
    {
        if (action == '+') {
            return this.plus(a,b);
        } else if (action == '-') {
            return this.minus(a,b);
        } else if (action == '*') {
            return this.multiply(a,b);
        } else if (action == '/') {
            return this.divide(a,b);
        } else {
            return this.typeAnErrorAndReturnDefaultValue("Wrong action: " + action);
        }
    }


    // second variant:
    private int typeAnErrorAndReturnDefaultValue(String error_message){
        System.out.println(error_message);
        return 0;
    }

    private int plus (int a, int b){
        return a + b;
    }

    private int minus (int a, int b){
        return a - b;
    }

    private int multiply (int a, int b){
        return a * b;
    }

    private int divide (int number, int divider){
        if(divider == 0){
            return this.typeAnErrorAndReturnDefaultValue("Can not divide by zero");
        }else {
            return number / divider;
        }
    }

    // third section of the lesson:
    public int simple_int = 7;
    public static int static_int = 7;

    // forth section of the lesson:
    public void changeSimpleInt(){
        this.simple_int = 8;
        static_int = 8;
    }
    final public int simple_int2 = 7; // is constant and can not be changed


    public static void changeSimpleIntByStaticFunction(){
        // this.simple_int = 8; -> error: non static variable in static method
    }
}
