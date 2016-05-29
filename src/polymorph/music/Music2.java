package polymorph.music;

/**
 * Created by Juan Pickselov on 5/28/16.
 */
public class Music2 {
    public static void tune(Wind instr){
        instr.play(Note.B_FLAT);
    }
    public static void tune(Stringed instr){
        instr.play(Note.MIDDLE_C);
    }
    public static void tune(Brass instr){
        instr.play(Note.C_SHARP);
    }
    // note how crazy above, you'd have to keep on adding tune for each instrument
    // see Music 3 for better handling of this
    public static void main(String[] args){
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass frenchHorn = new Brass();
        tune(flute);
        tune(violin);
        tune(frenchHorn);
    }
}
