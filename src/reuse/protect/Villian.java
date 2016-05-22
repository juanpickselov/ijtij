package reuse.protect;

class Villian {
	private String name;

	protected void set(String nm) {
		name = nm;
	}

	public Villian(String name) {
		this.name = name;
	}

	public String toString() {
		return "I'm a Villian named: " + name;
	}
}
