import java.io.File;
import java.util.Scanner;

public class Path1 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.print("Lütfen Dosya Yolunuzu Giriniz: ");
		String path= scanner.nextLine();
		
		File file= new File(path);
		String[] icerik= file.list();
		for(int i =0; i<icerik.length; i++) {
			System.out.println(icerik[i]);
		}
		scanner.close();

	}

}
