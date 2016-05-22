package reuse.delegation;

public class SpaceshipDelegation {
	private String name;
	private SpaceshipControls controls = new SpaceshipControls();

	public SpaceshipDelegation(String name) {
		this.name = name;
	}

	public void back(int velocity) {
		controls.back(velocity);
	}

	public void down(int velocity) {
		controls.down(velocity);
	}

	public void forward(int velocity) {
		controls.forward(velocity);
	}

	public void left(int velocity) {
		controls.left(velocity);
	}

	public void right(int velocity) {
		controls.right(velocity);
	}

	public void turboBoost() {
		controls.turboBoost();
	}

	public void up(int velocity) {
		controls.up(velocity);
	}

	public static void main(String[] args) {
		SpaceshipDelegation protector = new SpaceshipDelegation("NSEA Protector");
		protector.forward(100);
	}
}
