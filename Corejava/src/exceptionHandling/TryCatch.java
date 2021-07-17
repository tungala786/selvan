package exceptionHandling;

public class TryCatch {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		try {
		System.out.println(a[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid array index!");
		}
		System.out.println("Hello");
		System.out.println("World");				
	}

}
