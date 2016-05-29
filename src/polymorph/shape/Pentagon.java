package polymorph.shape;

import static com.juanpickselov.util.Print.print;

/**
 * Created by Juan Pickselov on 5/28/16.
 */
public class Pentagon extends Shape {
    @Override
    public void draw() {
        print("Pentagon.draw()");
    }

    @Override
    public void erase() {
        print("Pentagon.erase()");
    }

    @Override
    public void sayHello(){
        print("I keep the government and military in shape!");
    }
}
