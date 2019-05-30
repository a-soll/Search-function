/**
 * @author Adam Solloway
 * 
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pathomp search = new Pathomp("1.23.3455", ".lr");
		
		search.func();
		System.out.println(search.print());
	}

}