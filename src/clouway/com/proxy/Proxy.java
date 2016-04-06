package clouway.com.proxy;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Proxy implements IntegerFactory {
    private Integer integer;

    public Proxy(Integer integer) {
        this.integer = integer;
    }

    @Override
    public void createInstance() {
        System.out.println("The number is:" + integer);
    }
}
