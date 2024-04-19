import java.util.Vector;

public class VectorClassExample {

	public static void main(String[] args) {
		Vector<String> vector= new Vector<>(5);
		vector.add("Kedi");
		vector.add("Köpek");
		vector.add("Kuş");
		vector.add("inek");
		vector.add("Koyun");
		
		for(int i=0; i<vector.size(); i++) {
			String string = vector.get(i);
			System.out.println((i)+ " "+ string);
		}
		
		System.out.println("Vectorün Kapasitesi: " + vector.capacity());
		System.out.println("Kedi değeri var mı? "+ vector.contains("Kedi"));
		
		int indexOf = vector.indexOf("Kedi");
		System.out.println("Kedi kaçıncı indiste? " + indexOf);
		
		//vector'ün içini temizlemek için clear kullanırız.
		vector.clear();
		System.out.println("Clear dan sonraki değerler: " + vector.size());
		System.out.println("Clear dan sonra vector kapasitesi: " + vector.capacity());
	}

}
