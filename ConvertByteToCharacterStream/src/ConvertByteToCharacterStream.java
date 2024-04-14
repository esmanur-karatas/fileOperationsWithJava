import java.io.File;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ConvertByteToCharacterStream {

	public static void main(String[] args) {
		fileWrite();
		fileReader();
	}
	
	public static void fileReader() {
		File file= new File("test.txt");
		FileInputStream fileInputStream= null;
		InputStreamReader inputStreamReader=null;
		BufferedReader bufferedReader=null;
		try {
			fileInputStream= new FileInputStream(file);
			inputStreamReader= new InputStreamReader(fileInputStream);
			bufferedReader= new BufferedReader(inputStreamReader);
		    System.out.println(bufferedReader.readLine());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				}catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
			if(inputStreamReader != null) {
				try {
					inputStreamReader.close();
				}catch(IOException e) {
					System.out.println(e.getMessage());
				}
			}
			if(fileInputStream != null) {
				try {
					fileInputStream.close();
				}catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}
		
	}
	
	public static void fileWrite() {
		File file= new File("test.txt");
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(file);
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
			outputStreamWriter.write("MERHABA, NASILSINIZ?");
			outputStreamWriter.close();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if ( fileOutputStream != null) {
				try {
					fileOutputStream.close();
				}catch(IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}

	}

}