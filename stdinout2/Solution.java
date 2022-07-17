// import java.io.*;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args){
		try (Scanner scan = new Scanner(System.in)){
			Integer x = scan.nextInt();
			Double xx = scan.nextDouble();
			scan.nextLine();
			String xxx = scan.nextLine();

			System.out.println("String: " + xxx);
			System.out.println("Double: "+xx);
			System.out.println("Integer: "+x);
		}

		System.out.println("End of code");
	}
}
