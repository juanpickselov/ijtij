package polymorph.music;

/**
 * Created by Juan Pickselov on 5/28/16.
 */
public class Music {
    public static void tune(Instrument intsrmnt){
        intsrmnt.play(Note.MIDDLE_C);
    }
    public static void main(String[] args){
        Wind flute = new Wind();
        tune(flute); //upcasting, remember this from the other chapter?
    }
}
