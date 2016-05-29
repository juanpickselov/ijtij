package polymorph.music3;

import polymorph.music.Note;

import static com.juanpickselov.util.Print.print;

/**
 * Created by Juan Pickselov on 5/28/16.
 */
public class Percussion extends Instrument {

    @Override
    void play(Note nte){
        print("Percussion.play() " + nte);
    }

    @Override
    String what(){
        return "Percussion";
    }

    @Override
    void adjust(){
        print("Adjusting Percussion");
    }
}
