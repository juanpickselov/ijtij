package objects;

/**
 * Created by tomg on 5/21/16.
 */
public class LightTest {

    public static void main(String[] args){
        Light lite = new Light();
        lite.on();
        lite.brighten();
        lite.dim();
        lite.off();
    }
}
