package Variables;

public class SameValueVariable {
	/**
	 * Here x,y and z are declared beforehand, and later assigned same values
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int x, y, z;
		x = y = z = 200;

		System.out.println(x + y + z); // 600
	}
}
