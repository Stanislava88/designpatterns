package clouway.com.proxy;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
    public static void main(String[] args) {
        IntegerFactory integer=new IntegerProxy(10);
        integer.createInstance();
    }
}
