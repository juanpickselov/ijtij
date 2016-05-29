package polymorph.music3;

import polymorph.music.Note;

import static com.juanpickselov.util.Print.print;

/**
 * Created by Juan Pickselov on 5/28/16.
 */
class Instrument {
    void play(Note nte){
        print("Instrument.play() " + nte);
    }
    String what(){
        return "Instrument";
        }
    void adjust() {
        print("Adjusting Instrument");
    }
}
