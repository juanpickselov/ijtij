package reuse.car;

public class CarTest {
	public static void main(String[] args){
		Car car = new Car();
		car.left.window.rollup();
		car.wheel[0].inflate(72);
		car.engine.service();
	}
}
