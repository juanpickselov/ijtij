package reuse.upcasting;

/**
 * Created by tomg on 5/21/16.
 */
public class Toad extends Amphibian {

    public static void main(String[] args){

        Toad toad = new Toad();
        Amphibian.makeSound(toad);
    }

}
