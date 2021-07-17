package exceptionHandling;

public class TryFinally {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		try {
		System.out.println(a[3]);
		}finally {
			System.out.println("Executing the finally block...");
		}
		System.out.println("Hello");
		System.out.println("World");	

	}

}
