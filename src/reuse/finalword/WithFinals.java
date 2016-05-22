package reuse.finalword;

import static com.juanpickselov.util.Print.*;

class WithFinals {

	// identical to "private" alone
	private final void f() {
		print("WithFinals.f()");
	}

	// Also automatically "final":
	private void g() {
		print("WithFInals.g()");
	}
}
