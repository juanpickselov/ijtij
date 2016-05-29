package polymorph.shape;

import static com.juanpickselov.util.Print.print;

/**
 * Created by Juan Pickselov on 5/28/16.
 */
public class Circle extends Shape {

    @Override
    public void draw() {
        print("Circle.draw()");
    }

    @Override
    public void erase() {
        print("Circle.erase()");
    }

    @Override
    public void sayHello(){
        print("Circle of light");
    }
}
