import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DosyaAkislari {

	public static void main(String[] args) {
		File file = new File("hello.txt"); //file nesnesi oluşturup dosya adına hello.txt dedik.
		FileOutputStream fileOutputStream =null; //fileOutputStream sınıfını çağırdık.
		//hata bloklarının içine alıyoruz eğer işlem gerçekleşirse try bloğu hata alırsak catch bloğu çalışır.
		try {
			fileOutputStream = new FileOutputStream(file); //yukarıda oluşturduğumuz nesneyi çağırdık dosya ismi oluşsun diye
			fileOutputStream.write("Merhaba".getBytes());//yazdığımız string mesajın bytelarını fileOutputStream nesnesinin içine atar. 
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			if (fileOutputStream !=null) { //eğer fileOutputStream null değilse  
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
