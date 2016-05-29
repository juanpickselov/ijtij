package polymorph.music3;

import polymorph.music.Note;

import static com.juanpickselov.util.Print.print;

/**
 * Created by Juan Pickselov on 5/28/16.
 */
public class Percussion extends Instrument {
    void play(Note nte){
        print("Percussion.play() " + nte);
    }
    String what(){
        return "Percussion";
    }
    void adjust(){
        print("Adjusting Percussion");
    }
}
