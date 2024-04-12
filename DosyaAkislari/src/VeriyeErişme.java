import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class VeriyeErişme {

	public static void main(String[] args) {
		File file= new File ("hello.txt"); //nesne oluşturduk. hello.txt dosyasına erişmek için 
		FileInputStream fileInputStream = null;

		try {
			fileInputStream = new FileInputStream (file);
			int c =0;
			while((c= fileInputStream.read()) != -1) {
				System.out.print((char)c);
			}
			//read metodu ile dosyadaki btyeları okuyoruz.
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			if(fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
