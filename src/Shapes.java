import polymorph.shape.*;

import static com.juanpickselov.util.Print.*;

/**
 * Created by Juan Pickselov on 5/28/16.
 */
public class Shapes {
    private static RandomShapeMaker shapeMaker = new RandomShapeMaker();
    public static void main(String[] args){
        Shape[] shape = new Shape[9];
        for(int i=0;i<shape.length; i++){
            shape[i] = shapeMaker.next();
        }
        for (Shape shp: shape) {
            shp.draw();
            shp.sayHello();
            print();
        }
    }
}
