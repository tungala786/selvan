package collections;
import java.util.*;
public class Student {
    int rollno;
    String name;
    
    Student(int rollno,String name){   //constructor
    	this.rollno=rollno;
    	this.name=name;
    }
public static void main(String[] args) {
    Student s1=new Student(1111,"Sandhya");
    Student s2=new Student(2222,"Sreevidya");
    
    //create a collection of Students
    
    ArrayList<Student> st = new ArrayList<Student>();
    st.add(s1);
    st.add(s2);
    
    Iterator itr = st.iterator();
    
    while(itr.hasNext()) {
    	Student s = (Student) itr.next();
    	System.out.println(s.rollno+" "+s.name);
    }
  }
}
