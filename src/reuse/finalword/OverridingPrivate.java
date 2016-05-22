package reuse.finalword;

import static com.juanpickselov.util.Print.*;

class OverridingPrivate extends WithFinals {
	private final void f() {
		print("OverridingPrivate.f()");
	}
	
	private void g() {
		print("OverridingPrivate.g()");
	}
}
