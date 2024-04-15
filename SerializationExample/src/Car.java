import java.io.Serializable;

public class Car implements Serializable{
        private String plaka;
		private String brand;
		private String model;
		private int year;
		private Engine engine;
	
	public Car() {
		
	}
	
	public Car (String plaka , String brand, String model, int year, Engine engine) {
		this.plaka= plaka;
		this.brand= brand;
		this.model=model;
		this.year=year;
		this.engine= engine;
	}
		
		
	public String getPlaka() {
		return plaka;	
	}
		
	public void SetPlaka(String plaka) {
		this.plaka = plaka;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void SetBrand(String brand) {
		this.brand = brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public void SetModel(String model) {
		this.model = model;
	}
	
	public int getYear() {
		return year;
	}
	
	public void SetYear(int year) {
		this.year = year;
	}
	
	public Engine getEngine() {
		return engine;
	}
	
	public void SetEngine( Engine engine) {
		this.engine = engine;
	}
	@Override
	public boolean equals(Object other) {
		Car car= (Car)other;
		return this.plaka.equals(car.plaka);
	}
	
	@Override
	public String toString() {
		return "PLAKA: " + plaka + ", MARKA: " + brand + ", MODEL: "+ model+ ", YIL: "+ year+ ", MOTOR:" +engine.toString();
	}
}
