import java.io.File;
import java.io.IOException;
import java.sql.Date;

public class File1 {
    
    public static void main(String[] args) {
      File file = new File("C:\\Users\\ESMANUR\\Desktop\\sample.txt");
      System.out.println(file.exists()); //dosyanın verilen yol üzerinde olup olmadığını döndürür true ya da false.
      System.out.println(file.canRead()); //dosyayı okuma iznimizin olup olmadığını döndürür. dosyayı biz oluşturduğumuz için true döner.
      System.out.println(file.canWrite()); // dosyamızı yazma iznimiz olup olmadığını dosyayı biz oluşturduğumuz için true döner.
      System.out.println(file.isDirectory()); //dosyanın klasör olup olmadığını anlamamız için kullanılır. txt dosyası olduğu için false döner.
      System.out.println(file.getAbsolutePath()); // Dosyanın bulunduğu tam yolu almak için kullanılır.
      System.out.println(file.getParent()); //Bir üst dosyayı döndürür yani C:\\Users\\ESMANUR\\Desktop bunu döndürür.
      System.out.println(file.length()); //dosyanın içerisindeki verilerin kaç byte olduğunu döndürür. dosya boş olduğu için 0 döndürüyor.
      System.out.println(new Date(file.lastModified())); //dosya ya da klasör üzerinde yapılan son işlemin zamanını döndürür.
      
      //Dosya Oluşturma
      File file2 = new File("C:\\Users\\ESMANUR\\Desktop\\sample1.txt");
      if(!file2.exists()) {
    	  try {
    		  file2.createNewFile();
    		  
    	  }catch (IOException e) {
    		  e.printStackTrace();
    	  }
      }
      
      //Dosya Silme İşlemi
      if(file.exists()) {
    	  boolean delete= file.delete();
    	  System.out.println("Silindi mi? " +delete);
      }
    }
}
