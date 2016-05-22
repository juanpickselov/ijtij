package outside;

import static com.juanpickselov.util.Print.print;

public class GoblinTest {
	public static void main(String[] args) {
		Goblin goblin = new Goblin("BlackLagoon", 1);
		print(goblin);
		goblin.change("Samwise", 9);
		print(goblin);
	}
}
