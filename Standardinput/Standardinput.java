import java.util.*;

public class Standardinput{
	public static void main(String[] args)
	{
		System.out.println("Input two numbers and a string");
		try (Scanner scan = new Scanner(System.in)) {
			Integer a = scan.nextInt();
			Integer b = scan.nextInt();
			String c = scan.next();

			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}

	}
}