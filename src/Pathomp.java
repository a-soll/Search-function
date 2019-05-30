/**
 * @author Adam Solloway
 *
 */
public class Pathomp {
	private String s = "";
	private String expr = "";
	private String result = "";
	private int ind = 0;
	private char a;

	public Pathomp(String s, String expr) {
		this.s = s;
		this.expr = expr;
		a = expr.charAt(0);
	}

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


	public void left() {
		for(int i = ind - 1; i >= 0; i--) {
			result += s.charAt(i);
		}
		reverse();
	}

	public void right() {
		for(int i = ind + 1; i < s.length(); i++) {
			result += s.charAt(i);
		}
	}


	public void reverse() {
		result = new StringBuilder(result).reverse().toString();
	}

	public String print() {
		return result;
	}
}
