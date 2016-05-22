package reuse.protect;

import static com.juanpickselov.util.Print.print;

public class OrcTest {
	public static void main(String[] args){
		Orc orc = new Orc("Goubergah", 12);
		print(orc);
		orc.change("Adnoh", 19);
		print(orc);
	}
}
