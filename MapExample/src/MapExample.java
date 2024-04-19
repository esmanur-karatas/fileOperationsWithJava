import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		//integer değer alıp string türünde döneceğiz.
		HashMap<Integer, String> hashMap = new HashMap<>();
		
		//put metodu ile değerleri veriyoruz. 34 keyimiz, istanbul da değerimiz.
		hashMap.put(34, "İstanbul");
		hashMap.put(44, "Malatya");
		hashMap.put(06, "Ankara");
		hashMap.put(23, "Elazığ");
		hashMap.put(01, "Adana");
		
		System.out.println("HashMap Eleman Sayısı: "+ hashMap.size());
		
		//Elemanlara erişmek için get metodunu kullanırız.
		String string = hashMap.get(34);
		System.out.println("34: "+ string);
		
		//Tüm Değerleri Ekrana keySet metoduyla basarız.
		Set<Integer> keySet = hashMap.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			System.out.print(key + ": ");
			
			// value larında ekrana basmak istersek
			String value = hashMap.get(key);
			System.out.println(value);
		}
	}

}
