package reuse.composition;

import static com.juanpickselov.util.Print.*;

class Soap {
	private String s;

	Soap() {
		print("Soap()");
		s = "Constructed";
	}

	public String toString() {
		return s;
	}
}
