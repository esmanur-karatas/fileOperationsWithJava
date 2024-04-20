import java.util.ArrayList;
import java.util.Iterator;

public class AutoBoxingExample {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		
		// normalde burada ınteger yazardık ama int yazınca arka planda otomatik olarak autoboxing işlemi uygulanıyor.
		int x = 20;
		arrayList.add(x);
		
		int y = arrayList.get(1);
		
		arrayList.add(new Integer(5));
		
		Iterator<Integer> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			int i = iterator.next();
			System.out.println(i);
		}
		
		System.out.println("MİNİMUM DEĞER: "+ Integer.MIN_VALUE);
		System.out.println("MAXİMUM DEĞER: "+Integer.MAX_VALUE);
	}

}
