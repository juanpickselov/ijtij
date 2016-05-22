package reuse.finalword;

public class FinalOverridingIllusion {
	public static void main(String[] args) {
		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f(); // method is public in OverridingPrivate2
		op2.g(); // method is public in OverridingPrivate2
		// You can upcast:
		OverridingPrivate op = op2;
		// But you can't call the methods because in OverridingPrivate they're
		// private:
		// op.f(); // uncomment and won't compile
		// op.g(); // uncomment and won't compile
		// Same here:
		WithFinals wf = op2;
		// wf.f();
		// wf.g();
	}
}
