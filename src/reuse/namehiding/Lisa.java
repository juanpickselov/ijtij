package reuse.namehiding;

class Lisa extends Homer {
	// @Override annotation prevents you from accidentally overloading when you
	// don't mean to
	// So below doesn't compile
	// @Override void doh(Milhouse m){
	// System.out.println("doh(Milhouse)");
	// }

	@Override
	char doh(char x) {
		popMessageOnConsole();
		return x;
	}

	void popMessageOnConsole() {
		System.out.println("Lisa overrode the doh(char c)\nThis was a small example,but don't have a cow man!");
	}
}
