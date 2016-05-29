package polymorph.music;

import static com.juanpickselov.util.Print.*;
/**
 * Created by Juan Pickselov on 5/28/16.
 */
public class Wind extends Instrument{
    public void play(Note note){
        print("Wind.play() " + note);
    }
}
