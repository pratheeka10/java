import java.util.HashSet;

public class HashSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student2> hs = new HashSet<>();
		Student2 s1 = new Student2("C++",22,21);
		Student2 s2 = new Student2("Java",20,27);
		Student2 s3 = new Student2("JS",21,12);
		Student2 s4 = new Student2("Html",23,9);
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		System.out.println(hs);

	}

}
