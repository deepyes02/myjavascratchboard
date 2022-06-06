package Variables;

public class FinalVariables {

	public static void main(String[] args) {
		final String place = "Hokkaido";
		System.out.println("I live in " + place + ".");
		// place = "Nagarkot"; // throws error / remove this line for java to compile
		System.out.println("I live in " + place + ".");
	}
}
