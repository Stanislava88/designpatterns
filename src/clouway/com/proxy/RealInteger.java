package clouway.com.proxy;

import java.lang.*;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class RealInteger implements Integer {
    private int number;

    public RealInteger(int number) {
        this.number = number;
    }

    @Override
    public void display() {
        System.out.println("Number is" + number);
    }
}
