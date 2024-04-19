import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<Integer>integers= new LinkedList<>();
		integers.add(10);
		integers.add(20);
		integers.add(30);
		
		System.out.println("ELEMAN SAYISI: "+ integers.size()); //Eleman sayısını bastırır.
		
		System.out.println();
		
		//2. elemanı 55 yaptık. 30 da 55 ten sonra yazıldı yani 3. eleman oldu. 
		integers.add(2,55);
		System.out.println("KÜMENİN ELEMANLARI: ");
		Iterator<Integer> iterators= integers.iterator();
		while(iterators.hasNext()) {
			Integer next= iterators.next();
			System.out.println(next);
			
		}
		System.out.println("O. İNDEXTEKİ ELEMAN: "+ integers.get(0));
		System.out.println("SON İNDEXTEKİ ELEMAN: "+ integers.get(integers.size()-1));
		
		System.out.println("ELEMAN SAYISI: "+ integers.size()); //Eleman sayısını bastırır.
		//ilk elemanı değiştirir.
		integers.addFirst(33);
		System.out.println("İLK ELEMAN: "+integers.getFirst());
		
		//Son elemanı değiştirir.
		integers.addLast(100);
		System.out.println("SON ELEMAN: "+integers.getLast());
		
		//herhamgi bir elemanın indexini bulmak için
		int indexOf=integers.indexOf(55);
		System.out.println("Girilen Elemanın İndex Numarası: "+indexOf);
		
		//sondan arama yapar
		System.out.println("Sondan yapılan aramaya göre girilen değerin index numarası: "+ integers.lastIndexOf(55));
	}

}
