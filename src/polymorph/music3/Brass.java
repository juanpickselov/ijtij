package polymorph.music3;

import polymorph.music.Note;

import static com.juanpickselov.util.Print.print;

/**
 * Created by Juan Pickselov on 5/28/16.
 */
public class Brass extends Wind {
    void play(Note nte){
        print("Brass.play() " + nte);
    }
    void adjust(){print("Adjusting Brass");}
}
