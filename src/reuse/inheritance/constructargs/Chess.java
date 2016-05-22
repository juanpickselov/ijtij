package reuse.inheritance.constructargs;

import static com.juanpickselov.util.Print.*;

public class Chess extends BoardGame {

	Chess() {
		super(11);
		print("Chess constructor");
	}

	public static void main(String[] args) {
		Chess x = new Chess();
		print(x.getClass().getName());
	}
}
