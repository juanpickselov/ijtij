package polymorph.music3;

import polymorph.music.Note;

import static com.juanpickselov.util.Print.print;


/**
 * Created by Juan Pickselov on 5/28/16.
 */
public class Woodwind extends Wind {
    void play(Note nte) {
        print("Woodwind.play() " + nte);
    }
    String what(){
        return "Woodwind";
    }
}