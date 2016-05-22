package reuse.compinherit;

import static com.juanpickselov.util.Print.*;

class Knife extends Utensil {
	Knife(int i) {
		super(i);
		print("Knife constructor");
	}
}
