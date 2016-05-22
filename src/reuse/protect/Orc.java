package reuse.protect;

public class Orc extends Villian {
	private int orcNumber;

	public Orc(String name, int orcNumber) {
		super(name);
		this.orcNumber = orcNumber;
	}

	public void change(String name, int orcNumber) {
		set(name);
		this.orcNumber = orcNumber;
	}

	public String toString() {
		return "Orc " + orcNumber + ": " + super.toString();
	}
}
