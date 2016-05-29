package polymorph.music3;

import polymorph.music.Note;

/**
 * Created by Juan Pickselov on 5/28/16.
 */
public class Music3 {
    public static void tune(Instrument instr){
        instr.play(Note.B_FLAT);
    }
    // note the one tune method above
    public static void tuneAll(Instrument[] allInstr){
        for (Instrument instr : allInstr){
            tune(instr);
        }
    }
    public static void main(String[] args){
        Instrument[] orchestra = {new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind()};
        tuneAll(orchestra);
    }
}
