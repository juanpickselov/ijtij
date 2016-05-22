package outside;

public class Goblin extends reuse.protect.Creature {
	
	private int orcNumber;
	public Goblin(String name, int orcNumber){
		super(name);
		this.orcNumber=orcNumber;
	}
	
	public void change(String name, int orcNumber){
		set(name);
		this.orcNumber = orcNumber;
	}
	public String toString() {
		return "Creature " + orcNumber + ": " + super.toString();
	}
}
