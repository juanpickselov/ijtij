package polymorph.shape;

import static com.juanpickselov.util.Print.print;

/**
 * Created by Juan Pickselov on 5/28/16.
 */
public class Triangle extends Shape {

    @Override
    public void draw() {
        print("Triangle.draw()");
    }

    @Override
    public void erase() {
        print("Triangle.erase()");
    }

    @Override
    public void sayHello() {
        print("Triangle of Bermuda!");
    }
}
