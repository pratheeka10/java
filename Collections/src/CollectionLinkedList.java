import java.util.LinkedList;
import java.util.Scanner;
public class CollectionLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of linked list");
		int n = sc.nextInt();
		String[] a = new String[n];
		for(int i = 0;i < n;i++) {
			a[i] = sc.next();
		}
		LinkedList<String > ll = new LinkedList<String>();
		for(int i=0;i<n;i++) {
			ll.add(i,a[i]);
		}
		for(String b : ll) {
			System.out.println(b);
		}

	}

}
