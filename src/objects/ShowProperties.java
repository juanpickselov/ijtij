package objects;

public class ShowProperties {

	public static void main(String[] args) {
		System.out.println(System.getProperty("user.name") + "\n");
		System.out.println(System.getProperty("java.library.path") + "\n");
		System.getProperties().list(System.out);
	}
}
