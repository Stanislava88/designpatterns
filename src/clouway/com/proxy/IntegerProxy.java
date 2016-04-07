package clouway.com.proxy;

import java.lang.*;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class IntegerProxy implements Integer {
    private int number;
    private RealInteger realInteger;

    public IntegerProxy(int number) {
        this.number = number;
    }

    @Override
    public void display() {
        realInteger = new RealInteger(number);
        realInteger.display();
    }
}
