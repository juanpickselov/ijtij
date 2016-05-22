package reuse.upcasting;

class Instrument {
	public void play() {
	}

	static void tune(Instrument instr) {
		// ...
		instr.play();
		System.out.println("Tuned: " + instr.getClass().getSimpleName());
	}
}
