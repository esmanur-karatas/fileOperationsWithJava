import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		Scanner scan = new Scanner (System.in);
		String line = null;
		while (!(line= scan.nextLine()).equals("a")); {
			arrayList.add(line);
		}
		
		for(int i= 0; i<arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
		
		

	}

}
