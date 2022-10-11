import java.util.HashMap;
import java.util.Map;

public class CollectionHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(10, "Dog");
		hm.put(20, "Cat");
		hm.put(30, "Monkey");
		hm.put(40, "Donkey");
		
		HashMap<Integer,String> hm1 = new HashMap<Integer,String>();
		hm1.put(50, "Dog");
		hm1.put(60, "Cat");
		hm1.put(70, "Monkey");
		hm1.put(80, "Donkey");
		
		System.out.println(hm);
		System.out.println(hm1);
		
		String a = hm.get(10);
		System.out.println(a);
		
		hm.put(20, "Chimp");
		System.out.println(hm);
		
		hm1.remove(70);
		System.out.println(hm1);
		
		for(Map.Entry<Integer,String> e : hm.entrySet()) {
			System.out.println("Key: " +e.getKey() + " Value: " +e.getValue());
		}

	}

}
