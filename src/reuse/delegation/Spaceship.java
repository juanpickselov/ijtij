package reuse.delegation;

public class Spaceship extends SpaceshipControls {
	private String name;
	public Spaceship(String name) { this.name = name; } public String toString() { return name; }
	public static void main(String[] args) {
	Spaceship protector = new Spaceship("NSEA Protector"); protector.forward(100);
	}
}
