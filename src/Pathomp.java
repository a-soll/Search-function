/**
 * @author Adam Solloway
 * 
 * This class creates a function that searches a string, with parameters XYZ from string expr. X is the char to search for, 
 * while Y and Z are the directions. Y picks which side to start the search from and Z picks which side
 * of the term to search from.
 */
public class Pathomp {
	private String s = "";
	private String expr = "";
	private String result = "";
	private int ind = 0;
	private char a;

	/**
	 * Constructor
	 * @param s string to search
	 * @param expr search parameters
	 */
	public Pathomp(String s, String expr) {
		this.s = s;
		this.expr = expr;
		a = expr.charAt(0);
	}

	/**
	 * Method for searching based on parameters. l is left, r is right.
	 */
	public void func(){
		if(expr.charAt(1) == 'l') {
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i) != a) {
					ind++;
				}
				else {
					break;
				}
			}
			if(expr.charAt(2) == 'r') {
				right();
			}

			else if(expr.charAt(2) == 'l') {
				left();
			}
		}

		else if(expr.charAt(1) == 'r') {
			for (int i = s.length() - 1; i > 0; i--) {
				if (s.charAt(i) != expr.charAt(0)) {
					ind++;
				}
				else {
					break;
				}
			}
			if(expr.charAt(2) == 'l') {
				left();
			}
			else if(expr.charAt(2) == 'r') {
				right();
			}
		}
	}

	/**
	 * Method for searching the left of X
	 */
	public void left() {
		for(int i = ind - 1; i >= 0; i--) {
			result += s.charAt(i);
		}
		reverse();
	}

	/**
	 * Method for searching the right of X
	 */
	public void right() {
		for(int i = ind + 1; i < s.length(); i++) {
			result += s.charAt(i);
		}
	}

	/**
	 * Reverses the result string when searching from the left
	 */
	public void reverse() {
		result = new StringBuilder(result).reverse().toString();
	}

	/**
	 * @return the result
	 */
	public String print() {
		return result;
	}
}
