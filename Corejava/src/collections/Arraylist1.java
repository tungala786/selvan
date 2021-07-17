package collections;
import java.util.*;
public class Arraylist1 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Mahesh");
		al.add("Sreevidya");
		al.add("Sandhya");
		al.add("Manohar");
		al.add("Mahesh");
		
		System.out.println(al);
		System.out.println("****************************");
		System.out.println(al.get(2));  //prints sandhya
		System.out.println("***********Iterating the collection ********************");
		
		for(String s:al) {
			System.out.println(s);
		}
		
		al.set(2, "Vijay");
		System.out.println("*****************************************");
		System.out.println(al);
		
		al.clear();
		System.out.println("**************************************");
		System.out.println(al);
		
		

	}

}
