package primitives;

import static com.juanpickselov.util.Print.*;
public class Primitives {

    static boolean trueFalse = false;
    static char theChar = 'a';
    static byte bite = 127;
    static short aShort = 32767;
    static int anInt = 32769;
    static long aLong = 1L;
    static float aFloat = 1.01f;
    static double aDouble = 1234567.00d;
    // void is listed as a primitive in TiJ

    public static void main(String[] args){
        print(trueFalse);
        print(theChar);
        print(bite);
        print(aShort);
        print(anInt);
        print(aLong);
        print(aFloat);
        print(aDouble);
    }
}
