package polymorph.music3;

import polymorph.music.Note;

import static com.juanpickselov.util.Print.print;

/**
 * Created by Juan Pickselov on 5/28/16.
 */
public class Stringed extends Instrument {
    @Override
    void play(Note nte){
        print("Stringed.play() " + nte);
    }

    @Override
    String what(){
        return "Stringed";
    }

    @Override
    void adjust(){
        print("Adjusting Stringed");
    }
}
