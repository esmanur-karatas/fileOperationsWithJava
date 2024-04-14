import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;

public class RemoteFile {

	public static void main(String[] args) {
		try {
		URL url= new URL("https://www.w3.org/TR/2003/REC-PNG-20031110/iso_8859-1.txt");
		HttpURLConnection connection= (HttpURLConnection) url.openConnection();
		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader= new InputStreamReader(inputStream);
		char[] buffer = new char[1024];
		
		FileOutputStream fileOutputStream= new FileOutputStream("output.txt");
		// StringBuilder builder= new StringBuilder();
		
		int lenght=0;
		while((lenght=inputStreamReader.read(buffer))!=-1) {
			
			fileOutputStream.write(new String(Arrays.copyOfRange(buffer, 0, lenght)). getBytes());
			// builder.append(Arrays.copyOfRange(buffer, 0, lenght));
		}
		//System.out.println(builder.toString());
	}catch (Exception e ) {
		e.printStackTrace();
	}
  }
}