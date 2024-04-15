import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class SerializationExample {

	public static void main(String[] args) {
		Car car = new Car ();
		car.SetPlaka("23ADL232");
		car.SetBrand("X MARKA");
	    car.SetModel("Y MODEL");
	    car.SetYear(2023);
	    
	    Engine engine= new Engine() ;
	    engine.setVolume(1600);
	    car.SetEngine(engine);
	    
	    File file= new File("car.txt");
	    FileOutputStream fileOutputStream=null;
	    ObjectOutputStream objectOutputStream= null;
	    try {
	    	fileOutputStream = new FileOutputStream(file);
	    	objectOutputStream = new ObjectOutputStream(fileOutputStream);
	    	objectOutputStream.writeObject(car);
	    }catch(Exception e) {
	    	System.out.print(e.getMessage());
	    }finally {
	    	try {
	    		if(objectOutputStream != null) {
	    			objectOutputStream.close();
	    		}
	    		if(fileOutputStream != null) {
	    			fileOutputStream.close();
	    		}
	    		
	    	}catch (Exception e) {
	    		System.out.println(e.getMessage());
	    	}
	    }
	}

}
