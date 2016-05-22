package objects.docs;

import java.util.*;
/** An example using documentation comments.
 * Display Bonjour tout le monde
 * @author tomg
 * @version 1.0.0
 */

public class BonjourMonde {
	/** Entry point to class/app
	 * @param args array of string arguments
	 * @throws exceptions
	 */
	public static void main(String[] args){
		System.out.println("Bonjour tout le monde!");
		System.out.println(new Date());
	}
}
