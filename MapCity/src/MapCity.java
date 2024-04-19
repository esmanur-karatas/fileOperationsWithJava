import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapCity {

	public static void main(String[] args) {
		HashMap<Integer, City> hashMap = new HashMap<>();
		hashMap.put(34, new City("İstanbul", 25_000_000));
		hashMap.put(44, new City("Malatya", 24_000_000));
		hashMap.put(01, new City("Adana", 23_000_000));
		hashMap.put(06, new City("Ankara", 21_000_000));
		hashMap.put(23, new City("Elazığ", 20_500_000));
		
		System.out.println("Eleman Sayısı: "+hashMap.size());
		
		City city = hashMap.get(34);
		System.out.println(": "+city);
		
		Set<Integer> keySet = hashMap.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			System.out.println(key+ " " + hashMap.get(key));
		}
		
		// Sadece şehirleri bastırmak istersek.
		Collection<City> values= hashMap.values();
		Iterator<City> iterator1 = values.iterator();
		System.out.println("ŞEHİRLER: ");
		while(iterator1.hasNext()) {
			City next = iterator1.next();
			System.out.println(next);
		}
		
		
	}

}
