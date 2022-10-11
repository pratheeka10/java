
public class Student {
	String sname;
	int age;
	
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", age=" + age + "]";
	}
	
	Student(String sname,int age){
		this.sname = sname;
		this.age = age;
	}

}
