/**
 * @author Adam Solloway
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//String s = "123.3455";
		//String expr = ".lr";
		Pathomp search = new Pathomp("1.23.3455", ".lr");
		
		search.func();
		System.out.println(search.print());
	}

}