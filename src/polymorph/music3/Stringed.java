package polymorph.music3;

import polymorph.music.Note;

import static com.juanpickselov.util.Print.print;

/**
 * Created by Juan Pickselov on 5/28/16.
 */
public class Stringed extends Instrument {
    void play(Note nte){
        print("Stringed.play() " + nte);
    }
    String what(){
        return "Stringed";
    }
    void adjust(){
        print("Adjusting Stringed");
    }
}
