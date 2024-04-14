import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serilization {

	public static void main(String[] args) {
	Student student = new Student();
	student.setNumber(1);
	student.setName("Ali");
	student.setSurname("Domurcuk");
	student.setClasss("1-A");
	
	System.out.println(student);
	
	File file = new File("student.bin");
	FileOutputStream fileOutputStream= null;
	ObjectOutputStream objectOutputStream= null;
	try {
		fileOutputStream = new FileOutputStream(file);
		objectOutputStream= new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(student);
	}catch(Exception e ) {
		e.printStackTrace();
	}finally {
		try {
			if(objectOutputStream!=null) {
				objectOutputStream.close();
			}
			if(fileOutputStream!=null) {
				fileOutputStream.close();
			}
		}catch(Exception e2) {
			e2.printStackTrace();
		}
	}
	}

}
