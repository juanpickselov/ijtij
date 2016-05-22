package reuse.car;

public class Car {
	public Engine engine = new Engine();
	public Wheel[] wheel = new Wheel[4];
	public Door left = new Door(), right = new Door();

	public Car() {
		for (int i = 0; i < 4; i++) {
			wheel[i] = new Wheel();
		}
	}
}
