package reuse.upcasting;

import static com.juanpickselov.util.Print.print;

class Amphibian {
	public void jump(){
		print("hop hop hop");
	}
	
	static void makeSound(Amphibian amph){
		print("making sound of: " + amph.getClass().getSimpleName());
	}
}
