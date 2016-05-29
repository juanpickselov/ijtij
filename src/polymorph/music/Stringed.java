package polymorph.music;

import static com.juanpickselov.util.Print.print;

/**
 * Created by Juan Pickselov on 5/28/16.
 */
public class Stringed extends Instrument {
    public void play(Note n){
        print("Stringed playing: " + n);
    }
}
