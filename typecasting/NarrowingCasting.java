package typecasting;

public class NarrowingCasting {
	public static void main(String[] args){
		double myDouble = 9.78d;

		int myInt = (int) myDouble;


		System.out.println(myDouble); // 9.78
		System.out.println(myInt); // 9
	}
}