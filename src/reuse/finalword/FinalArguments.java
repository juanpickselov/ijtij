package reuse.finalword;

import static com.juanpickselov.util.Print.*;

public class FinalArguments {
	void with(final Gizmo giz) {
		// ! giz = new Gizmo(); //Illegal -- giz is final
		print("basically noop here");
	}

	void without(Gizmo gizmo) {
		gizmo = new Gizmo(); // OK -- gizmo not final
		gizmo.spin();
		print("Spinning spinning spin...");
	}

	// void f(final int i) {i++;} // Can't change
	// You can only read from a final primitive:
	int giz(final int i) {
		return i + 1;
	}
	public static void main(String[] args){
		FinalArguments bf = new FinalArguments();
		bf.without(null);
		bf.with(null);
	}
	
}
