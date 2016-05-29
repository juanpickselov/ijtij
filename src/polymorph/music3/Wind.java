package polymorph.music3;

import polymorph.music.Note;

import static com.juanpickselov.util.Print.print;

/**
 * Created by Juan Pickselov on 5/28/16.
 */
public class Wind extends Instrument {

    @Override
    void play(Note nte) {
        print("Wind.play() " + nte);
    }

    @Override
    String what(){
        return "Wind";
    }

    @Override
    void adjust(){
        print("Adjusting Wind");
    }
}
