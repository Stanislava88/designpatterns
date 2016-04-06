package clouway.com.proxy;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class IntegerProxy implements IntegerFactory {
    private Proxy proxy;
    Integer integer;

    public IntegerProxy(Integer integer) {
        this.integer = integer;
    }

    @Override
    public void createInstance() {
        proxy = new Proxy(integer);
        proxy.createInstance();
    }
}
