package datatypes;

public class Byte {
	public static void main(String[] args){
		// byte -128 to 127
		byte myNum = 120;
		System.out.println("A byte can store whole numbers from -128 to 127, i.e "+myNum);

		// short -32768 to 32767
		short myShortNum = 5000;
		System.out.println("A short can store nums from -32768 to 32767 " + myShortNum);

		// int -2,147,483,648 to 2,147,483,647
		int myInteger = 100000000;
		System.out.println("An integer can print approx from 2.147 billion to -2.147 billion numbers range, ie. "+myInteger);

		// long -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 
		long my_long_integer = 2999900000900000000L;
		System.out.println(my_long_integer+" is my long integer");

		//float
		// Upto 6-7 decimal points
		float my_float = 6.78909333344444444444447f;
		System.out.println(my_float); // prints 6.7890935

		double my_double = 6.78909333344444444444447d;
		System.out.println(my_double); // prints 6.789093333444445

		boolean isJavaFun = true;
		boolean isPhpFun = false;
		System.out.println("Java is fun "+isJavaFun+".\nPhp is fun "+isPhpFun);

		//char
		char myGrade = 'A';
		System.out.println(myGrade); // prints A

		// or assign ASCII characters
		char myVar1 = 65, myVar2 = 66, myvar3 = 67;
		System.out.println("Var 1: "+myVar1+".\nMyVar2: "+myVar2+"\nmyvar3: "+myvar3);
		// Var 1: A.
		// MyVar2: B
		// myvar3: C

		// String
		String greeting = "hello world";
		System.out.println(greeting); // prints 'hello world';
	}
}
