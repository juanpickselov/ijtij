package polymorph.music3;

import polymorph.music.Note;

import static com.juanpickselov.util.Print.print;

/**
 * Created by Juan Pickselov on 5/28/16.
 */
public class Wind extends Instrument {
    void play(Note nte) {
        print("Wind.play() " + nte);
    }
    String what(){
        return "Wind";
    }
    void adjust(){
        print("Adjusting Wind");
    }
}
