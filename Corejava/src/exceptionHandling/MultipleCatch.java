package exceptionHandling;

public class MultipleCatch {

	public static void main(String[] args) {
		int i=10;
		try {
		System.out.println(i/0);
		}catch(ArithmeticException e) {
			System.out.println("cannot divide a number by zero!");
		}
		 catch(ArrayIndexOutOfBoundsException e) {
			 System.out.println(e);
		 }
		 catch(IllegalStateException e) {
			 System.out.println(e);
		 }
		 catch(NullPointerException e) {
			 System.out.println(e);
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
		System.out.println("Hello");
		System.out.println("World");

	}

}
