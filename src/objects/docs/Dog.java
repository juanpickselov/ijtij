package objects.docs;

import static com.juanpickselov.util.Print.print;

/**
 * Created by Juan Pickselov on 5/21/16.
 */
class Dog {
    String name = new String();
    String says = new String();

    public static void main(String[] args) {
        Dog spot = new Dog();
        spot.name = "Spot";
        spot.says = "Ruff!";

        Dog scruffy = new Dog();
        scruffy.name = "Scruffy";
        scruffy.says = "Wurf!";

        print(spot.name + " " + spot.says);
        print(scruffy.name + " " + scruffy.says);

    }
}
