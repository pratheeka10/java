import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;
public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Vector<Student2> al = new Vector<>(n);
		Student2 s1 = new Student2("C++",22,21);
		Student2 s2 = new Student2("Java",20,27);
		Student2 s3 = new Student2("JS",21,12);
		Student2 s4 = new Student2("Html",23,9);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		
		

	}

	
}
