package clouway.com.proxy;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class IntegerFactory {
    public Integer getIntegerProxy(int number) {
        return new IntegerProxy(number);
    }
}
