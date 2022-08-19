// import java.io.InputStreamReader;
import java.util.*;
// import java.io.*;

public class LoopSeries {
	/**
	 * @param argh
	 */
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		// int t = 3;
		String [] inputArr = new String [t];

		// in.nextLine();
		for (int i = 0; i < t; i++) {
			String lineInput = in.nextLine();
			inputArr[i] = lineInput;
		}
			System.out.println(inputArr[0]);
			System.out.println(inputArr[1]);
			// System.out.println(inputArr[2]);
			// System.out.println(inputArr[3]);
		
		// for(int i = 0; i < inputArr.length; i++){
			// 	System.out.println(inputArr[i]);
		// }
		in.close();
	}
}