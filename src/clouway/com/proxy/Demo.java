package clouway.com.proxy;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
    public static void main(String[] args) {
        IntegerFactory factory = new IntegerFactory();
        Integer integer = factory.getIntegerProxy(10);
        integer.display();
    }
}
