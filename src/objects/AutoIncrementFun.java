package objects;

import static com.juanpickselov.util.Print.print;

/**
 * Created by Juan Pickselov on 5/21/16.
 */
public class AutoIncrementFun {
    public static void main(String[] args) {
        int i = 1;
        print("i : " + i);
        print("++i : " + ++i); // Pre-increment
        print("i++ : " + i++); // Post-increment
        print("i : " + i);
        print("--i : " + --i); // Pre-decrement
        print("i-- : " + i--); // Post-decrement
        print("i : " + i);
    }
}
