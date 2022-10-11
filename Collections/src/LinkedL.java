import java.util.LinkedList;

public class LinkedL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Student> obj = new LinkedList();
		Student s = new Student("Java",20);
		Student s2 = new Student("Html",32);
		Student s3 = new Student("CSS",12);
		Student s4 = new Student("JS",20);
		obj.add(s);
		obj.add(s2);
		obj.add(s3);
		obj.add(s4);
		System.out.println(obj);
		for(Student obj1 : obj) {
			System.out.println(obj1.age);
		}

	}

}
