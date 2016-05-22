package reuse.protect;

public class Creature {
	private String name;

	protected void set(String nm) {
		name = nm;
	}

	public Creature(String name) {
		this.name = name;
	}

	public String toString() {
		return "I'm a creature named: " + name;
	}

}
