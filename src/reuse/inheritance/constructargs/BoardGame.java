package reuse.inheritance.constructargs;

import static com.juanpickselov.util.Print.*;

class BoardGame extends Game {
	BoardGame(int i) {
		super(i);
		print("BoardGame constructor");
	}
}
