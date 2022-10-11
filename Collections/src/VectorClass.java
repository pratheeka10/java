import java.util.Scanner;
import java.util.Vector;
public class VectorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Vector<Integer> v = new Vector(n);
		for(int i=0;i<n;i++) {
			v.add(i);
		}
		System.out.println(v);
		v.remove(3);
		
		System.out.println(v);
		for(int i=0;i<v.size();i++) {
			System.out.print(v.get(i) + " ");
		}
		System.out.println();
		v.set(2, 10);
		System.out.println(v);

	}

}
