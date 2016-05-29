package polymorph.shape;

import java.util.Random;

/**
 * Created by Juan Pickselov on 5/28/16.
 */
public class RandomShapeMaker {
    private Random rand = new Random(47);
    public Shape next(){
        switch(rand.nextInt(5)){
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
            case 3: return new Pentagon();
        }
    }
}
