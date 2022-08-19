import java.util.*;

public class Standardinput{
	public static void main(String[] args)
	{
		System.out.println("Input two numbers and a string");
		try (Scanner scan = new Scanner(System.in)) {
			Integer a = scan.nextInt();
			Integer b = scan.nextInt();
			scan.nextLine();
			String c = scan.nextLine();

			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println("End of code");
			scan.close();
		}

	}
}