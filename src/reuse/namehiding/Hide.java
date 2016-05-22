package reuse.namehiding;

public class Hide {
	public static void main(String[] args){
		Bart b = new Bart();
		b.doh(1);
		b.doh('x');
		b.doh(1.0f);
		b.doh(new Milhouse());
		
		Lisa lisa = new Lisa();
		char qChar = lisa.doh('l');
		System.out.println(qChar + " is the character");
	}
}
