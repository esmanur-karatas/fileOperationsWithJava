import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<Movie> arrayList= new ArrayList<>();
		arrayList.add(new Movie("x filmi", "t yönetmen", MovieType.AKSİYON,2000));
		arrayList.add(new Movie("y filmi", "l yönetmen", MovieType.BELGESEL,2023));
		arrayList.add(new Movie("a filmi", "k yönetmen", MovieType.BİLİM_KURGU,2022));
		arrayList.add(new Movie("b filmi", "j yönetmen", MovieType.GERİLİM,2020));
		arrayList.add(new Movie("c filmi", "h yönetmen", MovieType.DRAM,2007));
		arrayList.add(new Movie("d filmi", "g yönetmen", MovieType.FANTASTİK,2005));
		arrayList.add(new Movie("e filmi", "f yönetmen", MovieType.KOMEDİ,2010));
		
		for(int i= 0; i< arrayList.size(); i++) {
			Movie movie= arrayList.get(i);
			System.out.println(movie);
		}
	}

}
