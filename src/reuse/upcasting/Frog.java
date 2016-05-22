package reuse.upcasting;

public class Frog extends Amphibian {
	public static void main(String[] args){
		Frog frg = new Frog();
		Amphibian.makeSound(frg);
	}
}
