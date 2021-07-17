package collections;
import java.util.*;
public class Arraylist2 {

	public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
		
		al.add("Mahesh");
		al.add("Sreevidya");
		al.add("Sandhya");
		al.add("A");
		al.add("1234");
		al.add("Mahesh");
		
		//using the iterator interface
		Iterator itr = al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
