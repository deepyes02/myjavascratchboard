import java.util.*;

public class Conditional {
	public static void main(String[] args) {
		// System.out.println("Enter a number");
		try (Scanner scan = new Scanner(System.in)) {
			int n = scan.nextInt();
			if (n >= 1 && n <= 100) {
				if (n % 2 != 0) {
					System.out.println("Weird");
				} else {
					if (n >= 2 && n <= 5) {
						System.out.println("Not Weird");
					}
					if (n >= 6 && n <= 20) {
						System.out.println("Weird");
					}
					if (n > 20) {
						System.out.println("Not Weird");
					}
				}
			} else {
				System.out.println("Please add a valid number");
			}
			// System.out.println("End of code");

		}
	}
}
