package reuse.inheritance;

import static com.juanpickselov.util.Print.*;

public class Cartoon extends Drawing {
	public Cartoon() {
		print("Cartoon constructor");
	}

	public static void main(String[] args) {
		Cartoon x = new Cartoon();
	}
}
